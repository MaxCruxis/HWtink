package edu.hw1.task2;

public class CountDigits {
    public int countDigits(Integer value) {
        if (value == 0) {
            return 1;
        } else {
            return (int) Math.log10(value) + 1;
        }
    }
}
