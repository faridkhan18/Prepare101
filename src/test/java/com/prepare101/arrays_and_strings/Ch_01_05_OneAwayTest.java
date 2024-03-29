package com.prepare101.arrays_and_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ch_01_05_OneAwayTest {

	private Ch_01_05_OneAway s = new Ch_01_05_OneAway();

    @Test
    public void withEmpty() {
        assertTrue(s.isOneAway("", ""));
    }

    @Test
    public void withOneEmpty() {
        assertTrue(s.isOneAway("", "b"));
    }

    @Test
    public void withTwoSingleWords() {
        assertTrue(s.isOneAway("a", "b"));
    }

    @Test
    public void withOneInsertion() {
        assertTrue(s.isOneAway("pae", "pale"));
    }

    @Test
    public void withOneDeletion() {
        assertTrue(s.isOneAway("pales", "paes"));
    }

    @Test
    public void withOneReplace() {
        assertTrue(s.isOneAway("pawe", "pave"));
    }

    @Test
    public void withMoreEdits() {
        assertFalse(s.isOneAway("paxye", "pamne"));
    }

}
