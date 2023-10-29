package edu.hw1.task4;

public class FixString {
//    public static void main(String[] args) {
//        System.out.println(fixString("оПомигети псаривьтс ртко!и"));
//        System.out.println(fixString("badce"));
//
//        System.out.println(fixString("hTsii  s aimex dpus rtni.g"));
//    }
    public  String fixString(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length()-1; i += 2) {
            newStr.append(str.charAt(i + 1));
            newStr.append(str.charAt(i));
        }
        if ((str.length() % 2) != 0) {
            newStr.append(str.charAt(str.length() - 1));
        }
        return newStr.toString();
    }
}
