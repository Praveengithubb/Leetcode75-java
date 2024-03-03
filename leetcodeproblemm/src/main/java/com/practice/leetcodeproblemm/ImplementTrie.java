package com.practice.leetcodeproblemm;

public class ImplementTrie {
    Node root;

    public ImplementTrie() {
        root = new Node();
    }

    public void insert(String word) {
        root.insert(word, 0);
    }

    public boolean search(String word) {
        return root.search(word, 0);
    }

    public boolean startsWith(String prefix) {
        return root.startsWith(prefix, 0);
    }

    class Node {
        Node[] nodes;
        boolean isEnd;

        public Node() {
            nodes = new Node[26]; 
        }

        public void insert(String word, int idx) {
            if (idx >= word.length()) {
                isEnd = true;
                return;
            }
            int charIndex = word.charAt(idx) - 'a';
            if (nodes[charIndex] == null) {
                nodes[charIndex] = new Node();
            }
            nodes[charIndex].insert(word, idx + 1);
        }

        public boolean search(String word, int idx) {
            if (idx >= word.length()) {
                return isEnd;
            }
            int charIndex = word.charAt(idx) - 'a';
            if (nodes[charIndex] == null) {
                return false;
            }
            return nodes[charIndex].search(word, idx + 1);
        }

        public boolean startsWith(String prefix, int idx) {
            if (idx >= prefix.length()) {
                return true;
            }
            int charIndex = prefix.charAt(idx) - 'a';
            if (nodes[charIndex] == null) {
                return false;
            }
            return nodes[charIndex].startsWith(prefix, idx + 1);
        }
    }

    public static void main(String[] args) {
        ImplementTrie tree = new ImplementTrie();
        tree.insert("apple");
        System.out.println(tree.search("apple"));
    }
}
