package solutions.parking_spot.server_side_caching.eviction_mechanism;


import java.util.Map;

public interface EvictionMechanism<K,V> {
    public void onGet(K key, Map<K,V> map);
    public void onPut(K key, Map<K,V> map);
    public void onDelete();
}
