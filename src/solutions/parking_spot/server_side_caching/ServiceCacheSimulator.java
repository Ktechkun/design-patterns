package solutions.parking_spot.server_side_caching;

import solutions.parking_spot.server_side_caching.cache.InMemoryCache;
import solutions.parking_spot.server_side_caching.eviction_mechanism.LruEviction;

public class ServiceCacheSimulator {
    public static void main(String[] args) {
        Service a = new Service(new InMemoryCache<String, String>(new LruEviction<String, String>(2)));
        String x;
        x = a.compute("1");
        x = a.compute("1");
        x = a.compute("1");
        x = a.compute("2");
        x = a.compute("1");
        x = a.compute("3");
        x = a.compute("1");
        x = a.compute("2");
        x = a.compute("2");
        x = a.compute("1");
    }
}
