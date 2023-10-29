package edu.hw1.task8;

import java.util.*;

public class KnightBoardCapture {
    /*public static void main(String[] args) {
        System.out.println(knightBoardCapture(new int[][]{
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 0}}));
        System.out.println(knightBoardCapture(new int[][]{
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0}
        }));
        System.out.println(knightBoardCapture(new int[][]{
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 0, 1}
        }));
    }*/

    private static final Map<Integer, int[]> movesMap =
            Map.of(
                    1, new int[]{2, 1},
                    2, new int[]{2, -1},
                    3, new int[]{-1, -2},
                    4, new int[]{1, -2}
            );

    public boolean knightBoardCapture(int[][] board) {
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                if (board[i][j] == 1) {
                    if (isOccupied(i, j, board)) return false;
                }

            }
        }
        return true;
    }

    private boolean isOccupied(int i, int j, int[][] board) {
        for (Map.Entry<Integer, int[]> entry : movesMap.entrySet()) {
            int[] value = entry.getValue();
            try {

                if (board[i + value[0]][j + value[1]] == 1) {
                    return true;
                }
            } catch (IndexOutOfBoundsException ignored) {

            }

        }
        return false;
    }
}
