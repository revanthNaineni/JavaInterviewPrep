package collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapCollisionExample {

    // Custom class with the same hashCode for all instances
    static class CollidingKey {
        private final String value;

        public CollidingKey(String value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            // Force hash collisions by returning a constant hash code
            return 1;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CollidingKey other = (CollidingKey) obj;
            return value.equals(other.value);
        }

        @Override
        public String toString() {
            return "CollidingKey{" + "value='" + value + '\'' + '}';
        }
    }

    public static void main(String[] args) {
        // Create a HashMap
        Map<CollidingKey, String> map = new HashMap<>();

        // Add multiple keys that collide
        map.put(new CollidingKey("Key1"), "Value1");
        map.put(new CollidingKey("Key2"), "Value2");
        map.put(new CollidingKey("Key3"), "Value3");
        map.put(new CollidingKey("Key4"), "Value4");
        map.put(new CollidingKey("Key5"), "Value4");
        map.put(new CollidingKey("Key6"), "Value5");
        map.put(new CollidingKey("Key7"), "Value1");
        map.put(new CollidingKey("Key8"), "Value2");
        map.put(new CollidingKey("Key9"), "Value3");
        map.put(new CollidingKey("Key10"), "Value4");
        map.put(new CollidingKey("Key11"), "Value4");
        map.put(new CollidingKey("Key12"), "Value5");


        // Display the HashMap contents
        System.out.println("HashMap Contents:");
        for (Map.Entry<CollidingKey, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Verify that collisions occur
        System.out.println("\nHash Codes:");
        for (CollidingKey key : map.keySet()) {
            System.out.println(key + " has hash code: " + key.hashCode());
        }
    }
}
