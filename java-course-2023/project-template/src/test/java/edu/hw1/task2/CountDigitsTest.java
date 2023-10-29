package edu.hw1.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitsTest {
    @Test
    void zeroShouldReturnOne() {
        var countDigits = new CountDigits();
        assertEquals(1, countDigits.countDigits(0));
    }

    @Test
    void sixtyShouldReturnTwo() {
        var countDigits = new CountDigits();
        assertEquals(2, countDigits.countDigits(60));
    }

    @Test
    void HundredShouldReturnThree() {
        var countDigits = new CountDigits();
        assertEquals(3, countDigits.countDigits(100));
    }
}