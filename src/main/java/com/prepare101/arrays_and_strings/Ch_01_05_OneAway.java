package com.prepare101.arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

/**
 * There are three types of edits that can be performed on strings: insert a
 * character, remove a character, or replace a character. Given two strings,
 * write a function to check if they are one edit (or zero edits) away.
 * <p>
 * EXAMPLE pale, ple -> true pales, pale -> true pale, bale -> true pale, bake
 * -> false
 */

public class Ch_01_05_OneAway {
	boolean isOneAway(String a, String b) {
		// trick here is identifying what each operaction means
		// replace is both the strings are of equal len and diff at one position
		// remove and add are just inverse of one another.

		if (a.length() == b.length()) {
			return checkForReplace(a, b);
		}

		if (a.length() + 1 == b.length()) {
			// addition
			return checkForInsert(a, b);

		}

		if (a.length() == b.length() + 1) {
			// removal
			return checkForInsert(b, a);

		}

		return false;

	}

	private boolean checkForInsert(String a, String b) {
		if (a.length() == 0)
			return true;

		// a is smaller by 1 then b

		// skip the one where we don't match and then compare the rest of the strings

		for (int i = 0; i < b.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				if (a.substring(i, a.length() - 1).equals(b.substring(i + 1, b.length() - 1))) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	private boolean checkForReplace(String a, String b) {
		boolean hasFoundDiff = false;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				if (hasFoundDiff) {
					return false;
				}
				hasFoundDiff = true;
			}
		}
		return true;
	}

}
