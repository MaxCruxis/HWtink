package edu.hw1.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitRotationTest {

    @Test
    void rotateLeftShouldReturnOne() {
        var bitRotation = new BitRotation();
        assertEquals(1, bitRotation.rotateLeft(16,1));
    }

    @Test
    void rotateRightShouldReturnFour() {
        var bitRotation = new BitRotation();
        assertEquals(4, bitRotation.rotateRight(8,1));
    }
}