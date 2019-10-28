package com.prepare101.arrays_and_strings;

import java.util.Arrays;

/**
 * Given two strings,write a method to decide if one is a permutation of the
 * other.
 */

public class Ch_01_02_CheckPermutation {
	boolean check(String a, String b) {

		if (a.length() != b.length())
			return false;

		if ((a.length() == b.length()) && a.length() == 0)
			return true;

		a = a.toLowerCase();
		b = b.toLowerCase();

		int frequncey_map[] = new int[26];

		for (int i = 0; i < a.length(); i++) {
			frequncey_map[(int) a.charAt(i) - (int) 'a']++;
			frequncey_map[(int) b.charAt(i) - (int) 'a']--;
		}

		for (int i = 0; i < 26; i++) {
			if (frequncey_map[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
