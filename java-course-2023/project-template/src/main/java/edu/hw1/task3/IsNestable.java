package edu.hw1.task3;

import java.util.Arrays;

public class IsNestable {
    public boolean isNestable(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).min().getAsInt() > Arrays.stream(arr2).min().getAsInt()
                && Arrays.stream(arr1).max().getAsInt() < Arrays.stream(arr2).max().getAsInt();
    }
}
