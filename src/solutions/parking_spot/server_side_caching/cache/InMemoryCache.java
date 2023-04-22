package solutions.parking_spot.server_side_caching.cache;

import solutions.parking_spot.server_side_caching.eviction_mechanism.EvictionMechanism;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class InMemoryCache<K,V> implements Cache<K,V>{

    Map<K,V> entries = new HashMap<>();
    EvictionMechanism<K,V> evictionMechanism;

    public InMemoryCache(EvictionMechanism<K,V> evictionMechanism) {
        this.evictionMechanism = evictionMechanism;
    }

    @Override
    public V get(K key) {
        V value = entries.getOrDefault(key, null);
        if(value == null) return null;
        evictionMechanism.onGet(key, entries);
        return value;
    }

    @Override
    public void put(K key, V value) {
        evictionMechanism.onPut(key, entries);
        entries.put(key, value);
    }
}
