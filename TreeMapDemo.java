package set;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> colors = new TreeMap<>();
        System.out.println("My Empty Map: " + colors);

        colors.put("Red", 1);
        colors.put("Orange", 2);
        colors.put("Brown", 3);
        colors.put("Pink", 4);
        colors.put("Blue", 5);
        System.out.println("After adding: " + colors);

        colors.remove("Orange");
        System.out.println("After removing: " + colors);

        for (String key : colors.keySet()) {
            System.out.println("Key: " + key + ", Value: " + colors.get(key));
        }
    }
}
