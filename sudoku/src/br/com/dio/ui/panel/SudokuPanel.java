package br.com.dio.ui.panel;

import br.com.dio.model.Space;
import br.com.dio.service.SudokuService;
import br.com.dio.ui.custom.input.NumberText;
import javax.swing.*;
import java.awt.*;

public class SudokuPanel extends JPanel {
    private final SudokuService service;

    public SudokuPanel(SudokuService service) {
        this.service = service;
        setLayout(new GridLayout(9, 9));
        initBoard();
    }

    private void initBoard() {
        Space[][] board = service.getBoard();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                add(new NumberText(board[row][col]));
            }
        }
    }
}
