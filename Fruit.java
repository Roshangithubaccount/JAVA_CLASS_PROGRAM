package ArrayList;

import java.util.List;
import java.util.ArrayList;

public class Fruit {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        System.out.println("My Fruits List Before Adding Elements: " + fruits);

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Kiwi");
        System.out.println("My Fruits List After Adding Elements: " + fruits);

        fruits.remove(1); // Removes "Banana" (index 1)
        System.out.println("My Fruits List After Removing an Element: " + fruits);
    }
}
