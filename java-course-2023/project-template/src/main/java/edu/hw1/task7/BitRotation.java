package edu.hw1.task7;

import java.util.Arrays;
import java.util.LinkedList;

public class BitRotation {

    public int rotateLeft(Integer value, int times) {
        LinkedList<Integer> list = new LinkedList<>();
        Arrays.stream(Integer.toBinaryString(value).split("")).map(String::trim)
                .forEach(x -> list.add(Integer.parseInt(x)));
        for (int i = 0; i < times; i++) {
            list.addLast(list.pollFirst());
        }
        return Integer.parseInt(String.valueOf(list)
                .replace("[", "")
                .replace("]", "")
                .replace(", ", ""), 2);

    }

    public int rotateRight(Integer value, int times) {
        LinkedList<Integer> list = new LinkedList<>();
        Arrays.stream(Integer.toBinaryString(value).split("")).map(String::trim)
                .forEach(x -> list.add(Integer.parseInt(x)));
        for (int i = 0; i < times; i++) {
            list.addFirst(list.pollLast());
        }
        return Integer.parseInt(String.valueOf(list)
                .replace("[", "")
                .replace("]", "")
                .replace(", ", ""), 2);

    }
}
