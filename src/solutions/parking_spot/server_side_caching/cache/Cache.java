package solutions.parking_spot.server_side_caching.cache;
public interface Cache<K, V> {

    public V get(K key);

    public void put(K key, V value);
}
