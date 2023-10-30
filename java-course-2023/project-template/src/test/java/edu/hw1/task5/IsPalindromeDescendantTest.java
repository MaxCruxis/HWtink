package edu.hw1.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeDescendantTest {

    @Test
    void returnTrue() {
        var isDescendant = new IsPalindromeDescendant();
        assertTrue(isDescendant.isDescendant(11211230));
    }
    @Test
    void returnFalse(){
        var isDescendant = new IsPalindromeDescendant();
        assertFalse(isDescendant.isDescendant(132));
    }

}