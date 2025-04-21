package br.com.dio.service;

import br.com.dio.model.Space;

public class SudokuService {
    private final Space[][] board = new Space[9][9];

    public SudokuService() {
        generateBoard();
    }

    private void generateBoard() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                board[row][col] = new Space(0, false);
            }
        }
    }

    public Space[][] getBoard() {
        return board;
    }
}
