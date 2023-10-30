package edu.hw1.task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KnightBoardCapture {
    private final List<int[]> list =
            new ArrayList<>(Arrays.asList(
                    new int[]{2, 1},
                    new int[]{2, -1},
                    new int[]{-1, -2},
                    new int[]{1, -2}));
    private static final int SIDE_LENGTH = 8;

    public boolean knightBoardCapture(int[][] board) {
        for (int j = 0; j < SIDE_LENGTH; j++) {
            for (int i = 0; i < SIDE_LENGTH; i++) {
                if (board[i][j] == 1) {
                    if (isOccupied(i, j, board)) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    private boolean isOccupied(int i, int j, int[][] board) {
        for (int[] array : list) {
            if (i + array[0] >= 0
                    && j + array[1] >= 0
                    && i + array[0] < SIDE_LENGTH
                    && j + array[1] < SIDE_LENGTH) {
                if (board[i + array[0]][j + array[1]] == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
