/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.service;

/**
 *
 * @author rodol
 */


import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {

    public static boolean isValidSudoku(char[][] board) {
        // Verificar filas
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i)) {
                return false;
            }
        }

        // Verificar columnas
        for (int j = 0; j < 9; j++) {
            if (!isValidColumn(board, j)) {
                return false;
            }
        }

        // Verificar subcuadros 3x3
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                if (!isValidSubgrid(board, boxRow, boxCol)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidRow(char[][] board, int row) {
        Set<Character> seen = new HashSet<>();
        for (int col = 0; col < 9; col++) {
            char current = board[row][col];
            if (current != '.') {
                if (seen.contains(current)) {
                    return false;
                }
                seen.add(current);
            }
        }
        return true;
    }

    private static boolean isValidColumn(char[][] board, int col) {
        Set<Character> seen = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            char current = board[row][col];
            if (current != '.') {
                if (seen.contains(current)) {
                    return false;
                }
                seen.add(current);
            }
        }
        return true;
    }

    private static boolean isValidSubgrid(char[][] board, int startRow, int startCol) {
        Set<Character> seen = new HashSet<>();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                char current = board[startRow + row][startCol + col];
                if (current != '.') {
                    if (seen.contains(current)) {
                        return false;
                    }
                    seen.add(current);
                }
            }
        }
        return true;
    }
}