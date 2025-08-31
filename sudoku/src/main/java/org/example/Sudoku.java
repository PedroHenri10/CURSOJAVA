package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class Sudoku extends JFrame {
    private final JTextField[][] cells = new JTextField[9][9];
    private final int[][] solution = new int[9][9];
    private final int[][] puzzle = new int[9][9];

    public Sudoku() {
        setTitle("Sudoku Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel sudokuPanel = new JPanel(new GridLayout(9, 9));

        generateSudoku();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                cells[row][col] = new JTextField();
                cells[row][col].setHorizontalAlignment(JTextField.CENTER);
                Font font = new Font("Arial", Font.BOLD, 22);
                cells[row][col].setFont(font);
                cells[row][col].setBorder(BorderFactory.createLineBorder(Color.GRAY));

                if (puzzle[row][col] != 0) {
                    cells[row][col].setText(String.valueOf(puzzle[row][col]));
                    cells[row][col].setEditable(false);
                    cells[row][col].setBackground(Color.LIGHT_GRAY);
                    cells[row][col].setForeground(Color.BLACK);
                } else {
                    cells[row][col].setText("");
                    final int r = row;
                    final int c = col;

                    cells[row][col].addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyReleased(KeyEvent e) {
                            String text = cells[r][c].getText();

                            if (!text.matches("[1-9]?")) {
                                cells[r][c].setText("");
                                text = "";
                            }

                            if (text.isEmpty()) {
                                puzzle[r][c] = 0;
                            } else {
                                puzzle[r][c] = Integer.parseInt(text);
                            }

                            validateAndHighlightConflicts();
                        }
                    });
                }
                sudokuPanel.add(cells[row][col]);
            }
        }

        add(sudokuPanel, BorderLayout.CENTER);

        JButton checkButton = new JButton("Verificar Solução");
        checkButton.addActionListener(e -> checkSolution());
        add(checkButton, BorderLayout.SOUTH);

        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void validateAndHighlightConflicts() {
        Set<JTextField> conflictingCells = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            Map<Integer, List<JTextField>> numbersInRow = new HashMap<>();
            for (int c = 0; c < 9; c++) {
                if (puzzle[r][c] != 0) {
                    numbersInRow.computeIfAbsent(puzzle[r][c], k -> new ArrayList<>()).add(cells[r][c]);
                }
            }
            for (List<JTextField> list : numbersInRow.values()) {
                if (list.size() > 1) {
                    conflictingCells.addAll(list);
                }
            }
        }

        for (int c = 0; c < 9; c++) {
            Map<Integer, List<JTextField>> numbersInCol = new HashMap<>();
            for (int r = 0; r < 9; r++) {
                if (puzzle[r][c] != 0) {
                    numbersInCol.computeIfAbsent(puzzle[r][c], k -> new ArrayList<>()).add(cells[r][c]);
                }
            }
            for (List<JTextField> list : numbersInCol.values()) {
                if (list.size() > 1) {
                    conflictingCells.addAll(list);
                }
            }
        }

        for (int blockRow = 0; blockRow < 9; blockRow += 3) {
            for (int blockCol = 0; blockCol < 9; blockCol += 3) {
                Map<Integer, List<JTextField>> numbersInBlock = new HashMap<>();
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        int row = blockRow + r;
                        int col = blockCol + c;
                        if (puzzle[row][col] != 0) {
                            numbersInBlock.computeIfAbsent(puzzle[row][col], k -> new ArrayList<>()).add(cells[row][col]);
                        }
                    }
                }
                for (List<JTextField> list : numbersInBlock.values()) {
                    if (list.size() > 1) {
                        conflictingCells.addAll(list);
                    }
                }
            }
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (cells[r][c].isEditable()) {
                    if (conflictingCells.contains(cells[r][c])) {
                        cells[r][c].setForeground(Color.RED);
                    } else {
                        cells[r][c].setForeground(Color.BLACK);
                    }
                }
            }
        }
    }

    private void checkSolution() {
        boolean isComplete = true;
        boolean hasErrors = false;

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (puzzle[r][c] == 0) {
                    isComplete = false;
                }
                if (puzzle[r][c] != solution[r][c]) {
                    hasErrors = true;
                }
            }
        }

        if (!isComplete) {
            JOptionPane.showMessageDialog(this, "O jogo está incompleto. Preencha todas as células!");
        } else if (hasErrors) {
            JOptionPane.showMessageDialog(this, "Existem erros na sua solução. Continue tentando!");
        } else {
            JOptionPane.showMessageDialog(this, "Parabéns! Você venceu!");
        }
    }

    private void generateSudoku() {
        fillGrid(solution);
        copyGrid(solution, puzzle);
        removeNumbers(puzzle, 40);
    }

    private boolean fillGrid(int[][] grid) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) {
                    List<Integer> numbers = new ArrayList<>();
                    for (int n = 1; n <= 9; n++) numbers.add(n);
                    Collections.shuffle(numbers);
                    for (int num : numbers) {
                        if (isSafe(grid, row, col, num)) {
                            grid[row][col] = num;
                            if (fillGrid(grid)) return true;
                            grid[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isSafe(int[][] grid, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == num || grid[i][col] == num) return false;
        }
        int startRow = row - row % 3, startCol = col - col % 3;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (grid[startRow + r][startCol + c] == num) return false;
            }
        }
        return true;
    }

    private void removeNumbers(int[][] grid, int count) {
        Random rand = new Random();
        while (count > 0) {
            int row = rand.nextInt(9);
            int col = rand.nextInt(9);
            if (grid[row][col] != 0) {
                grid[row][col] = 0;
                count--;
            }
        }
    }

    private void copyGrid(int[][] src, int[][] dest) {
        for (int i = 0; i < 9; i++) {
            System.arraycopy(src[i], 0, dest[i], 0, 9);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Sudoku::new);
    }
}
