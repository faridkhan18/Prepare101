package com.prepare101.arrays_and_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ch_01_02_CheckPermutationTest {

	private Ch_01_02_CheckPermutation s = new Ch_01_02_CheckPermutation();

	@Test
	public void withEmptyString() {
		assertTrue(s.check("", ""));
	}

	@Test
	public void withOneSingleChar() {
		assertTrue(s.check("a", "a"));
	}

	@Test
	public void withOneSingleDifferentChar() {
		assertFalse(s.check("a", "b"));
	}

	@Test
	public void withThreeChars() {
		assertTrue(s.check("abc", "bac"));
	}

	@Test
	public void withRepeatingChars() {
		assertTrue(s.check("aabbc", "bcaba"));
	}

	@Test
	public void withDifferentLength() {
		assertFalse(s.check("abc", "ab"));
	}

}
