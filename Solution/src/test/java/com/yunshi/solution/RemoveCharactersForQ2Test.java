package com.yunshi.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveCharactersForQ2Test {
    @Test
    public void testRemoveConsecutive() {
        assertEquals("d", RemoveCharactersForQ2.removeConsecutive("abcccbad"));
    }
}
