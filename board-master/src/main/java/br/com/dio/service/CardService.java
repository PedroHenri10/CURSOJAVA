package br.com.dio.service;

import br.com.dio.dto.BoardColumnInfoDTO;
import br.com.dio.exception.CardBlockedException;
import br.com.dio.exception.CardFinishedException;
import br.com.dio.exception.EntityNotFoundException;
import br.com.dio.persistence.dao.BlockDAO;
import br.com.dio.persistence.dao.CardDAO;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static br.com.dio.persistence.entity.BoardColumnKindEnum.CANCEL;
import static br.com.dio.persistence.entity.BoardColumnKindEnum.FINAL;

@AllArgsConstructor
public class CardService {

    private final Connection connection;
    private final TransactionHandler transactionHandler;

    public void createCard(final Long columnId, final String title, final String description) {
        transactionHandler.execute(() -> {
            var dao = new CardDAO(connection);
            dao.insert(new br.com.dio.persistence.entity.CardEntity(null, title, description, columnId));
            return null;
        });
    }

    public void moveToNextColumn(final Long cardId, final List<BoardColumnInfoDTO> columns) {
        transactionHandler.execute(() -> {
            var dao = new CardDAO(connection);
            var card = dao.findById(cardId)
                    .orElseThrow(() ->
                            new EntityNotFoundException("Card " + cardId + " não encontrado"));

            if (card.blocked()) {
                throw new CardBlockedException("Card bloqueado");
            }

            var current = columns.stream()
                    .filter(c -> c.id().equals(card.columnId()))
                    .findFirst()
                    .orElseThrow();

            if (current.kind().equals(FINAL)) {
                throw new CardFinishedException("Card já finalizado");
            }

            var next = columns.stream()
                    .filter(c -> c.order() == current.order() + 1)
                    .findFirst()
                    .orElseThrow();

            dao.moveToColumn(next.id(), cardId);
            return null;
        });
    }

    public void cancel(final Long cardId, final Long cancelColumnId,
                       final List<BoardColumnInfoDTO> columns) {
        transactionHandler.execute(() -> {
            var dao = new CardDAO(connection);
            var card = dao.findById(cardId)
                    .orElseThrow(() ->
                            new EntityNotFoundException("Card " + cardId + " não encontrado"));

            if (card.blocked()) {
                throw new CardBlockedException("Card bloqueado");
            }

            var current = columns.stream()
                    .filter(c -> c.id().equals(card.columnId()))
                    .findFirst()
                    .orElseThrow();

            if (current.kind().equals(FINAL)) {
                throw new CardFinishedException("Card já finalizado");
            }

            dao.moveToColumn(cancelColumnId, cardId);
            return null;
        });
    }

    public void block(final Long cardId, final String reason,
                      final List<BoardColumnInfoDTO> columns) {
        transactionHandler.execute(() -> {
            var dao = new CardDAO(connection);
            var card = dao.findById(cardId)
                    .orElseThrow(() ->
                            new EntityNotFoundException("Card " + cardId + " não encontrado"));

            if (card.blocked()) {
                throw new CardBlockedException("Card já está bloqueado");
            }

            var current = columns.stream()
                    .filter(c -> c.id().equals(card.columnId()))
                    .findFirst()
                    .orElseThrow();

            if (current.kind().equals(FINAL) || current.kind().equals(CANCEL)) {
                throw new IllegalStateException("Não é possível bloquear nessa coluna");
            }

            new BlockDAO(connection).block(reason, cardId);
            return null;
        });
    }

    public void unblock(final Long cardId, final String reason) {
        transactionHandler.execute(() -> {
            var dao = new CardDAO(connection);
            var card = dao.findById(cardId)
                    .orElseThrow(() ->
                            new EntityNotFoundException("Card " + cardId + " não encontrado"));

            if (!card.blocked()) {
                throw new CardBlockedException("Card não está bloqueado");
            }

            new BlockDAO(connection).unblock(reason, cardId);
            return null;
        });
    }
}
