package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class UnitTestSearchSuggestionsSystem {

	@Test
	public void test() {
		 SearchSuggestionsSystem.Solution solution = new SearchSuggestionsSystem.Solution();
	        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
	        String search = "mouse";
	        List<List<String>> suggestedProducts = solution.suggestedProducts(products, search);
	        assertEquals(5, suggestedProducts.size());

	       assertEquals(List.of("mobile", "moneypot","monitor"), suggestedProducts.get(0));
	        assertEquals(List.of("mobile", "moneypot","monitor"), suggestedProducts.get(1));
	        assertEquals(List.of("mouse", "mousepad"), suggestedProducts.get(2));
	        assertEquals(List.of("mouse", "mousepad"), suggestedProducts.get(3));
	        assertEquals(List.of("mouse", "mousepad"), suggestedProducts.get(4));
	}

}
