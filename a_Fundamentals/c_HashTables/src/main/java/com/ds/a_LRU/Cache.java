package com.ds.a_LRU;

import java.util.Optional;

public interface Cache <K,V> {
    boolean set(K key, V value);
    Optional<V> get(K key);
}
