package com.ds;

import java.util.Map;

public class A_wordFrequencyCount {
    public static void main(String[] args) {
        String text = "hello world hello java";
        Map<String, Integer> wordCount = countRepeatingWords(text);
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static Map<String, Integer> countRepeatingWords(String text) {
        Map<String, Integer> wordCountMap = new java.util.HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }
}
