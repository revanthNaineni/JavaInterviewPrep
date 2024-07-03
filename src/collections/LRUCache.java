package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
    	System.out.println("removeEldestEntry invoked");
        return size() > capacity;
    }

	/*
	 * public V get(K key) { return super.getOrDefault(key, null); }
	 * 
	 * public void put(K key, V value) { super.put(key, value); }
	 */

    public static void main(String[] args) {
        LRUCache<Integer, String> lruCache = new LRUCache<>(3);
        
        lruCache.put(1, "A");
        lruCache.put(2, "B");
        lruCache.put(3, "C");
        
        System.out.println(lruCache); // Output: {1=A, 2=B, 3=C}
        
        lruCache.get(1); // Access key 1
        System.out.println(lruCache);
        lruCache.put(4, "D"); // Add key 4, which causes key 2 to be evicted
        
        System.out.println(lruCache); // Output: {3=C, 1=A, 4=D}
    }
}
