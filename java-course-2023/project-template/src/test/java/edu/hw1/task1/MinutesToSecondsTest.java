package edu.hw1.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsTest {
    @Test
    void sixtyNineShouldReturn() {
        var minutesToSeconds = new MinutesToSeconds();
        assertEquals(69, minutesToSeconds.minToSecs("01:09"));
    }

    @Test
    void incorrectString() {
        var minutesToSeconds = new MinutesToSeconds();
        assertEquals(-1, minutesToSeconds.minToSecs("01:60"));
    }

    @Test
    void hundredNineMinutesTest() {
        var minutesToSeconds = new MinutesToSeconds();
        assertEquals(6540, minutesToSeconds.minToSecs("109:0"));
    }
}