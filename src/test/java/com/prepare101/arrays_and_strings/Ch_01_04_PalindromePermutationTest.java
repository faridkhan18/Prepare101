package com.prepare101.arrays_and_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ch_01_04_PalindromePermutationTest {

	private Ch_01_04_PalindromePermutation s = new Ch_01_04_PalindromePermutation();

	@Test
	public void withEmpty() {
		assertTrue(s.check(""));
	}

	@Test
	public void withOneChar() {
		assertTrue(s.check("a"));
	}

	@Test
	public void withTwoWords_OddLetters() {
		assertTrue(s.check("acto tac"));
	}

	@Test
	public void withTwoWords_OddLetters_ThreeOccurences() {
		assertTrue(s.check("act atac"));
	}

	@Test
	public void withTwoWords_EvenLetters() {
		assertTrue(s.check("act cat"));
	}

}
