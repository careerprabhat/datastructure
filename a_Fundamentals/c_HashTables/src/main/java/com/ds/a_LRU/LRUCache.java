package com.ds.a_LRU;

public class LRUCache<K,V> implements Cache<K,V>{
    private final int capacity;
    private final java.util.LinkedHashMap<K, V> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new java.util.LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    @Override
    public boolean set(K key, V value) {
        cache.put(key, value);
        return true;
    }

    @Override
    public java.util.Optional<V> get(K key) {
        return java.util.Optional.ofNullable(cache.get(key));
    }
}
