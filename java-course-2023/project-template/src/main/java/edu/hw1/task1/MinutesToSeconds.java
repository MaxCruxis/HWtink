package edu.hw1.task1;

import java.util.Arrays;

public class MinutesToSeconds {
    /*public static void main(String[] args) {
        minsToSecs("01:00");
        minsToSecs("13:56");
        minsToSecs("10:60");
    }*/

    public int minToSecs(String str) {
        int[] ints = Arrays.stream(str.split(":")).map(String::trim).mapToInt(Integer::parseInt).toArray();
        if (ints[1] > 59) {
            System.out.println(-1);
            return -1;

        } else {
            System.out.println(ints[0] * 60 + ints[1]);
            return ints[0] * 60 + ints[1];
        }
    }
}
