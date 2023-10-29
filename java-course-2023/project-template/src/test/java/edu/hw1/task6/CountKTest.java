package edu.hw1.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountKTest {

    @Test
    void shouldReturnFive() {
        var countK = new CountK();
        assertEquals(5, countK.countK(6621));

    }

    @Test
    void equalDigitsShouldReturnZero() {
        var countK = new CountK();
        assertEquals(0, countK.countK(6666));
    }
}