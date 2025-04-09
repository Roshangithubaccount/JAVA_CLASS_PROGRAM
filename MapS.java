package set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;



public class MapS {
    public static void main(String[] args) {
        Map<String, Integer> colors = new HashMap<>();
        System.out.println("My Empty Map:" + colors);

        colors.put("Red", 1);
        colors.put("Orange", 2);
        colors.put("Brown", 3);
        colors.put("Pink", 4);
        colors.put("Blue", 5);
        System.out.println(" after adding:" + colors);

        colors.remove("Orange");
        System.out.println("After removing:" + colors);


        for (String key : colors.keySet()) {
            System.out.println("Key: " + key + ", Value: " + colors.get(key));

        }
    }
}
