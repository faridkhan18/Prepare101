package com.prepare101.arrays_and_strings;

import java.util.Arrays;

/**
 * Write a method to replace all spaces in a string with '%20' You may assume
 * that the string has sufficient space at the end to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: If
 * implementing in Java,please use a character array so that you can perform
 * this operation in place.)
 * <p>
 * EXAMPLE Input: "Mr John Smith ", 13 Output: "Mr%20John%20Smith"
 */

public class Ch_01_03_URLify {

	/*
	 * char[] urlify(String str, int trueLength) { // trim of the end str =
	 * str.trim(); int spaceCount =0; /// first try finding the actual length that
	 * is need to implement it for (int i = str.length(); i >= 0; i--) { if
	 * (str.charAt(i) == ' ') { spaceCount++; } }
	 * 
	 * 
	 * int actuallen = trueLength + spaceCount *2; char [] res = new
	 * char[actuallen];
	 * 
	 * 
	 * for (int i = trueLength -i; i >= 0; i--) { if(str.charAt(i) == ' ') { str[i
	 * -0] = '0'; str[i -1] = '2'; str[i -2] = '%'; i = i - 2; }else { res[i] = }
	 * 
	 * 
	 * }
	 * 
	 * 
	 * return "".toCharArray();
	 * 
	 * }
	 */}
