package com.ds;

public class A_CRUD_Trie {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("world");
        trie.insert("hi");

        System.out.println(trie.search("hello")); // true
        System.out.println(trie.search("world")); // true
        System.out.println(trie.search("hi"));    // true
        System.out.println(trie.search("hey"));   // false

        trie.delete("world");
        System.out.println(trie.search("world")); // false

    }
}
