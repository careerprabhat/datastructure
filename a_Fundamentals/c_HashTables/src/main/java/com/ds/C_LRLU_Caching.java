package com.ds;

import java.util.Map;

class LRUCache {
    private final int capacity;
    private final java.util.LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new java.util.LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}
public class C_LRLU_Caching {
        public static void main(String[] args) {
            LRUCache cache = new LRUCache(2); // Cache capacity of 2
            cache.put(1, 1);
            cache.put(2, 2);
            System.out.println(cache.get(1)); // returns 1
            cache.put(3, 3); // evicts key 2
            System.out.println(cache.get(2)); // returns -1 (not found)
            cache.put(4, 4); // evicts key 3
            System.out.println(cache.get(3)); // returns -1 (not found)
            System.out.println(cache.get(4)); // returns 4
        }
}
