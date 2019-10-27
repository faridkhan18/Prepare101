package com.prepare101.arrays_and_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ch_01_01_IsUniqueTest {

	private Ch_01_01_IsUnique s = new Ch_01_01_IsUnique();

	@Test
	public void withEmptyString() {
		assertTrue(s.isUnique(""));
	}

	@Test
	public void withUniqueString() {
		assertTrue(s.isUnique("abcde"));
	}

	@Test
	public void withDuplication() {
		assertFalse(s.isUnique("abcda"));
	}

}
