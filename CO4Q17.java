/*Program to demonstrate the working of Map interface by adding, changing and removing 
elements.*/

import java.util.HashMap;
import java.util.Map;
public class CO4Q17 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Dave", 40);
        System.out.println("Initial Map: " + map);
        map.put("Alice", 26);
        System.out.println("Map after changing value for 'Alice': " + map);
        map.remove("Charlie");
        System.out.println("Map after removing 'Charlie': " + map);
    }
}