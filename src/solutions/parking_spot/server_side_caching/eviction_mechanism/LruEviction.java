package solutions.parking_spot.server_side_caching.eviction_mechanism;

import java.util.*;

public class LruEviction<K,V> implements EvictionMechanism<K,V>{
    int capacity;
    int count = 0;
    Deque<K> listOfEntries = new ArrayDeque<>();

    public LruEviction(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void onGet(K key, Map<K,V> map) {
        if(count == 0) {
            count++;
            listOfEntries.addFirst(key);
        }
        if(listOfEntries.remove(key))listOfEntries.addFirst(key);
    }

    @Override
    public void onPut(K key, Map<K,V> map) {

        listOfEntries.addFirst(key);
        count++;
        if (count > capacity) {
            map.remove(listOfEntries.getLast());
            listOfEntries.removeLast();
        }
    }

    @Override
    public void onDelete() {
        System.out.println("doing something on delete");
    }
}
