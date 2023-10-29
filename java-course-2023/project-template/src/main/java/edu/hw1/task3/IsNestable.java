package edu.hw1.task3;
import java.util.Arrays;

public class IsNestable {
//    public static void main(String[] args) {
//        System.out.println(isNestable(new int[]{1, 2, 3, 4}, new int[]{0, 6}));
//        System.out.println(isNestable(new int[]{3, 1}, new int[]{4, 0}));
//        System.out.println(isNestable(new int[]{9, 9, 8}, new int[]{8, 9}));
//        System.out.println(isNestable(new int[]{1, 2, 3, 4}, new int[]{2, 3}));
//
//
//
//    }
    public  boolean isNestable(int[]arr1, int[] arr2){
        return Arrays.stream(arr1).min().getAsInt() > Arrays.stream(arr2).min().getAsInt() && Arrays.stream(arr1).max().getAsInt() < Arrays.stream(arr2).max().getAsInt();
    }
}
