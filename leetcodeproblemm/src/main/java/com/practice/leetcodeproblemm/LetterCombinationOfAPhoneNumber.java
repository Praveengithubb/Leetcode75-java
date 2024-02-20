package com.practice.leetcodeproblemm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {
	public static List<String> letterCombinations(String digits) {
		if (digits.isEmpty()) {
			return Collections.emptyList();
		}
		List<String> output = new ArrayList<String>();
		String[] phone_map = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		backtrack("", digits, phone_map, output);
		return output;
	}

	public static void backtrack(String combination, String next_digit, String[] phone_map, List<String> output) {
		if (next_digit.isEmpty()) {
			output.add(combination);
		} else {
			String letters = phone_map[next_digit.charAt(0) - '2'];
			for (char letter : letters.toCharArray()) {
				backtrack(combination + letter, next_digit.substring(1), phone_map, output);
			}
		}
	}

	public static void main(String[] args) {
		String S = "23";
		System.out.println(letterCombinations(S));
	}
}
