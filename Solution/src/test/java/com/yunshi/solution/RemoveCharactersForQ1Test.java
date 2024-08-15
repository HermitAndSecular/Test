package com.yunshi.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveCharactersForQ1Test {
    @Test
    public void testRemoveConsecutive() {
        assertEquals("d", RemoveCharactersForQ1.removeConsecutive("aabcccbbadeee"));
    }
}
