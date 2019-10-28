package com.prepare101.arrays_and_strings;

import java.util.Arrays;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */

public class Ch_01_01_IsUnique {
	boolean isUnique(String s) {
		if (s.isEmpty())
			return true;

		s = s.toLowerCase();
		
		if(s.length() >128)
			return false;

		int frequency_dict[] = new int[128];

		for (int i = 0; i < s.length(); i++) {
			if (frequency_dict[(int) s.charAt(i)] != 0) {
				System.out.println(s.charAt(i));
				return false;
			} else {
				frequency_dict[(int) s.charAt(i)] = frequency_dict[(int) s.charAt(i)] + 1;
			}
		}
		return true;

	}

}
