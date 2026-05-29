package com.ds;

/**
 * Trie (Prefix Tree) implementation in Java.
 * This data structure is used for efficient retrieval of keys in a dataset of strings.
 * It supports insertion, search, and prefix matching operations.
 * Additionally, it includes a delete operation to remove words from the trie.
 * Time Complexity:
 * - Insertion: O(m), where m is the length of the word being inserted.
 * - Search: O(m), where m is the length of the word being searched.
 * - StartsWith: O(m), where m is the length of the prefix being checked.
 * - Deletion: O(m), where m is the length of the word being deleted.
 * Space Complexity:
 * - O(n * m), where n is the number of words in the trie and m is the average length of the words.
 * Note: The space complexity can be optimized by sharing common prefixes among the words.
 * This implementation uses a HashMap to store the children of each TrieNode, which allows for efficient insertion and search operations.
 *  The delete operation is implemented recursively, and it marks the end of a word as false when a word is deleted. However, it does not remove the nodes from the trie, which can lead to unused nodes if many words are deleted. A more complex implementation could include logic to remove nodes that are no longer needed after deletion.
 *  This implementation assumes that the input words consist of lowercase English letters. If you need to support a wider range of characters, you may need to modify the TrieNode class to accommodate additional characters.
 *  This implementation is suitable for applications such as autocomplete, spell checking, and prefix-based search.
 *  *  Example usage:
 *  Trie trie = new Trie();
 *  trie.insert("hello");
 *  trie.insert("world");
 *  trie.insert("hi");
 *  *  System.out.println(trie.search("hello")); // true
 *  *  System.out.println(trie.search("world")); // true
 *  *  System.out.println(trie.search("hi"));    // true
 *  *  System.out.println(trie.search("hey"));   // false
 *
 */
public class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

    public void delete(String world) {
        delete(root, world, 0);
    }

    private void delete(TrieNode current, String word, int index) {
        if (index == word.length()) {
            if (!current.isEndOfWord) {
                return;
            }
            current.isEndOfWord = false;
            return;
        }
        char ch = word.charAt(index);
        TrieNode child = current.children.get(ch);
        if (child == null) {
            return;
        }
        delete(child, word, index + 1);
    }

    private class TrieNode {
        private java.util.Map<Character, TrieNode> children;
        private boolean isEndOfWord;

        public TrieNode() {
            children = new java.util.HashMap<>();
            isEndOfWord = false;
        }
    }

        public void insert(String word) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                current.children.putIfAbsent(ch, new TrieNode());
                current = current.children.get(ch);
            }
            current.isEndOfWord = true;
        }

        public boolean search(String word) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                if (!current.children.containsKey(ch)) {
                    return false;
                }
                current = current.children.get(ch);
            }
            return current.isEndOfWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode current = root;
            for (char ch : prefix.toCharArray()) {
                if (!current.children.containsKey(ch)) {
                    return false;
                }
                current = current.children.get(ch);
            }
            return true;
        }
}
