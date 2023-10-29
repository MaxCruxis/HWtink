package edu.hw1.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CountK {
    /*public static void main(String[] args) {
        System.out.println(CountK.countK(3524));
        System.out.println(CountK.countK(6621));
        System.out.println(CountK.countK(6554));
        System.out.println(CountK.countK(1234));
    }*/

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
        if (value == KAPREKARS_CONSTANT) {
            int i = getCount();
            CountK.setCount(0);
            return i;
        } else {
            List<Integer> digits = new ArrayList<>();
            while (value > 0) {
                digits.add(value % 10);
                value /= 10;
            }
            List<Integer> reverseDigits;
            if (digits.get(NULL).equals(digits.get(FIRST)) && digits.get(NULL).equals(digits.get(SECOND)) && digits.get(NULL).equals(digits.get(THIRD))) {
                return count;
            } else {
                Collections.sort(digits);
                reverseDigits = new ArrayList<>(digits.reversed());
            }
            value = reverseDigits.get(NULL) * ONE_THOUSAND + reverseDigits.get(FIRST) * ONE_HUNDRED + reverseDigits.get(SECOND) * TEN + reverseDigits.get(THIRD) - digits.get(NULL) * ONE_THOUSAND - digits.get(FIRST) * ONE_HUNDRED - digits.get(SECOND) * TEN - digits.get(THIRD);
            CountK.setCount(getCount() + 1);
            return countK(value);
        }
    }
}
