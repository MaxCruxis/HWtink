package edu.hw1.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixStringTest {
    @Test
    void shouldReturnFixedString() {
        var fixStr = new FixString();
        assertEquals("Помогите исправить строки!", fixStr.fixString("оПомигети псаривьтс ртко!и"));
    }

    @Test
    void oddSizedString() {
        var fixStr = new FixString();
        assertEquals("abcde", fixStr.fixString("badce"));

    }

    @Test
    void charString() {
        var fixStr = new FixString();
        assertEquals("a", fixStr.fixString("a"));

    }

}