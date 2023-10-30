package edu.hw1.task5;

import java.util.ArrayList;
import java.util.List;


public class IsPalindromeDescendant {

    public boolean isDescendant(int value) {
        List<Integer> digits = new ArrayList<>();
        final int ten = 10;
        int val = value;
        while (val > 0) {
            digits.add(val % ten);
            val /= ten;
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
                    final int digitLimit = 9;
                    if (digits.get(i) + digits.get(i + 1) > digitLimit) {
                        arr.add((digits.get(i) + digits.get(i + 1)) / ten);
                        arr.add((digits.get(i) + digits.get(i + 1)) % ten);
                    } else {
                        arr.add(digits.get(i) + digits.get(i + 1));
                    }
                }
                digits = arr;
                left = 0;
                right = arr.size() - 1;
            } else {
                return false;
            }

        }
        if (digits.size() < 2) {
            return false;
        }
        return statement;

    }
}
