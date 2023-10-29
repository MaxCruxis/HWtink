package edu.hw1.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsNestableTest {
    @Test
    void shouldReturnTrue() {
        var isNestable = new IsNestable();
        assertTrue(isNestable.isNestable(new int[]{1, 2, 3, 4}, new int[]{0, 6}));
    }
    @Test
    void shouldReturnFalse() {
        var isNestable = new IsNestable();
        assertFalse(isNestable.isNestable(new int[]{9, 9, 8}, new int[]{8, 9}));
    }

}