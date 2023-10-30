package edu.hw1.task1;

import java.util.Arrays;

public class MinutesToSeconds {
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int SECONDS_LIMIT = 59;

    public int minToSecs(String str) {
        int[] ints = Arrays.stream(str.split(":")).map(String::trim).mapToInt(Integer::parseInt).toArray();
        if (ints[ints.length - 1] > SECONDS_LIMIT) {
            return -1;

        } else {
            return ints[0] * SECONDS_IN_MINUTE + ints[1];
        }
    }
}
