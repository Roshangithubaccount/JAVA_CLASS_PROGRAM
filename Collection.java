package ArrayList;

import java.util.List;
import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("My numbers List: " + numbers);

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        System.out.println("My numbers List After Adding Elements: " + numbers);

        numbers.remove(2);  // Removes the element at index 2 (i.e., 300)
        System.out.println("My numbers List After Removing an Element: " + numbers);
    }
}
