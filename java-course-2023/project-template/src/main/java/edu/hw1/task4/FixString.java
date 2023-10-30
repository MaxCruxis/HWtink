package edu.hw1.task4;

public class FixString {
    public String fixString(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i += 2) {
            newStr.append(str.charAt(i + 1));
            newStr.append(str.charAt(i));
        }
        if ((str.length() % 2) != 0) {
            newStr.append(str.charAt(str.length() - 1));
        }
        return newStr.toString();
    }
}
