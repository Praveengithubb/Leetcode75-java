package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestImplementTrie {

	@Test
	public void test() {
		ImplementTrie tree = new ImplementTrie();
		tree.insert("apple");
		assertEquals(true, tree.startsWith("ap"));
		assertEquals(true, tree.search("apple"));
	}
	@Test
	public void test1() {
		ImplementTrie tree = new ImplementTrie();
		tree.insert("apple");
		assertEquals(false, tree.startsWith("ab"));
		assertEquals(false, tree.search("appl"));
	}
}
