import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SimpleMapExample {

    public static void main(String[] args) {

        // Creating a HashMap to store Integer keys and String values
        Map<Integer, String> map = new HashMap<>();

        // Adding some key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        // Print the entire map (unordered)
        System.out.println("Map contents: " + map);

        // Traversing the map using entrySet and an iterator
        System.out.println("\nTraversing the map using an iterator:");
        Set<Entry<Integer, String>> entrySet = map.entrySet();  // Convert map to a set of entries
        Iterator<Entry<Integer, String>> iterator = entrySet.iterator();  // Get an iterator for the set

        // Iterate through the set and print each entry (key-value pair)
        while (iterator.hasNext()) {
            Entry<Integer, String> entry = iterator.next();  // Get the next entry
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Traversing the map using forEach method (Java 8 and above)
        System.out.println("\nTraversing the map using forEach method (Java 8+):");
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        System.out.println("pull");
    }
}
