package com.prepare101.arrays_and_strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Given a string, write a function to check if it is a permutation of a
 * palindrome. A palindrome is a word or phrase that is the same forwards and
 * backwards. A permutation is a rearrangement of letters. The palindrome does
 * not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE Input: Tact Coa Output: True (permutations: "taco cat", "atco cta",
 * etc.)
 */

public class Ch_01_04_PalindromePermutation {
	boolean check(String s) {
		s = s.toLowerCase();
		if (s.length() < 2)
			return true;

		Map<Character, Integer> map = getFrequencyMap(s);
		Iterator<Entry<Character, Integer>> itr = map.entrySet().iterator();
		if (s.length() % 2 == 0) {
			while (itr.hasNext()) {
				if (itr.next().getValue() % 2 != 0)
					return false;
			}
			return true;
		} else {
			// odd condition only one should have
			int counter = 0;
			while (itr.hasNext()) {
				if (itr.next().getValue() % 2 != 0) {
					if (counter == 0) {
						counter++;
					} else {
						return false;
					}
				}
			}
			return true;
		}
	}

	private Map<Character, Integer> getFrequencyMap(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(1), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(1), 1);
			}
		}
		return map;
	}
}
