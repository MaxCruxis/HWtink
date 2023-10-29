package edu.hw1.task2;

public class CountDigits {
//    public static void main(String[] args) {
//        countDigits(4666);
//        countDigits(544);
//        countDigits(0);
//        System.out.println(countDigits(0));
//    }

    public  int countDigits(Integer value) {
        if (value == 0) return 1;
        else return (int) Math.log10(value) + 1;
    }
}
