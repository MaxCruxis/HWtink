package edu.hw1.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountK {
    private static int count = 0;
    private static final int ONE_THOUSAND = 1000;
    private static final int ONE_HUNDRED = 100;
    private static final int TEN = 10;
    private static final int NULL = 0;
    private static final int FIRST = 1;
    private static final int SECOND = 2;
    private static final int THIRD = 3;
    private static final int KAPREKARS_CONSTANT = 6174;

    public static void setCount(int count) {
        CountK.count = count;
    }

    public static int getCount() {
        return count;
    }

    public int countK(int value) {
        final int ten = 10;
        int val = value;
        if (val == KAPREKARS_CONSTANT) {
            int i = getCount();
            CountK.setCount(0);
            return i;
        } else {
            List<Integer> digits = new ArrayList<>();
            while (val > 0) {
                digits.add(val % ten);
                val /= ten;
            }
            List<Integer> reverseDigits;
            if (digits.get(NULL).equals(digits.get(FIRST))
                    && digits.get(NULL).equals(digits.get(SECOND))
                    && digits.get(NULL).equals(digits.get(THIRD))) {
                return count;
            } else {
                Collections.sort(digits);
                reverseDigits = new ArrayList<>(digits.reversed());
            }
            val = reverseDigits.get(NULL) * ONE_THOUSAND
                    + reverseDigits.get(FIRST) * ONE_HUNDRED
                    + reverseDigits.get(SECOND) * TEN
                    + reverseDigits.get(THIRD)
                    - digits.get(NULL) * ONE_THOUSAND
                    - digits.get(FIRST) * ONE_HUNDRED
                    - digits.get(SECOND) * TEN
                    - digits.get(THIRD);
            CountK.setCount(getCount() + 1);
            return countK(val);
        }
    }
}
