package com.practice.leetcodeproblemm;

import java.util.ArrayList;
import java.util.List;

public class SearchSuggestionsSystem {

  public static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean endOfWord;

        TrieNode() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    public static class Solution {
        public void insertWord(TrieNode trie, String word) {
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (trie.children[index] == null)
                    trie.children[index] = new TrieNode();
                trie = trie.children[index];
            }
            trie.endOfWord = true;
        }

        public List<String> searchWord(TrieNode trie, String prefix) {
            List<String> result = new ArrayList<>();
            for (char c : prefix.toCharArray()) {
                int index = c - 'a';
                if (trie.children[index] == null)
                    return new ArrayList<>();
                trie = trie.children[index];
            }
            dfs(trie, prefix, result);
            return result;
        }

        public void dfs(TrieNode trie, String pre, List<String> result) {
            if (result.size() == 3)
                return;
            if (trie.endOfWord)
                result.add(pre);

            for (int i = 0; i < 26; i++) {
                if (trie.children[i] != null)
                    dfs(trie.children[i], pre + (char) (i + 'a'), result);
            }
        }

        public List<List<String>> suggestedProducts(String[] products, String search) {
            TrieNode trie = new TrieNode();
            for (String prod : products)
                insertWord(trie, prod);
            List<List<String>> result = new ArrayList<>();
            String prefix = "";
            for (char c : search.toCharArray()) {
                prefix += c;
                result.add(searchWord(trie, prefix));
            }
            return result;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String search = "mouse";
        List<List<String>> suggestedProducts = solution.suggestedProducts(products, search);
        for (List<String> list : suggestedProducts) {
            System.out.println(list);
        }
    }
}

