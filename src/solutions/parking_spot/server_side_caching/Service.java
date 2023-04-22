package solutions.parking_spot.server_side_caching;

import solutions.parking_spot.server_side_caching.cache.Cache;

public class Service {
    private final Cache<String, String> cache;

    public Service(Cache<String, String> cache) {
        this.cache = cache;
    }

    public String compute(String key) {
        String value = cache.get(key);
        if(value == null) {
            System.out.println("CACHE MISS on : "+ key);
            value = key;
            cache.put(key, value);
        } else {
            System.out.println("CACHE HITT on : "+ key);
        }
        System.out.println();
        return value;
    }
}
