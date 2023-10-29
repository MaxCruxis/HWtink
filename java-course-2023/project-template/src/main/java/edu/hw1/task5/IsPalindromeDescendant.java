package edu.hw1.task5;

import java.util.*;


public class IsPalindromeDescendant {
//    public static void main(String[] args) {
//        System.out.println(isDescendant(11211230));
//        System.out.println(isDescendant(13001120));
//        System.out.println(isDescendant(23336014));
//        System.out.println(isDescendant(11));
//        System.out.println(isDescendant(12));
//
//    }

    public  boolean isDescendant(int value) {
        List<Integer> digits = new ArrayList<>();
        while (value > 0) {
            digits.add(value % 10);
            value /= 10;
        }

        int left = 0;
        int right = digits.size() - 1;
        boolean statement = true;
        while (left < right) {
            if (digits.get(left).equals(digits.get(right))) {
                left++;
                right--;
            } else if (digits.size() % 2 == 0) {
                List<Integer> arr = new ArrayList<>();
                for (int i = 0; i < digits.size() - 1; i += 2) {
                    if (digits.get(i) + digits.get(i + 1) > 9) {
                        arr.add((digits.get(i) + digits.get(i + 1)) / 10);
                        arr.add((digits.get(i) + digits.get(i + 1)) % 10);
                    } else arr.add(digits.get(i) + digits.get(i + 1));
                }
                digits = arr;
                left = 0;
                right = arr.size() - 1;
            } else {
                return false;
            }

        }
        if (digits.size() < 2) return false;
        return statement;

    }
}
