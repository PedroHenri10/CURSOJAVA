package br.com.dio.ui;

import br.com.dio.service.SudokuService;
import br.com.dio.ui.panel.SudokuPanel;

import javax.swing.*;

public class UMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sudoku");
            SudokuService service = new SudokuService();
            frame.setContentPane(new SudokuPanel(service));
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
