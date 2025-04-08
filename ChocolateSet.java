package set;

import java.util.TreeSet;

public class ChocolateSet {
    public static void main(String[] args) {
        TreeSet<String> chocolate = new TreeSet<>();

        System.out.println("My empty set is: " + chocolate);

        // Adding elements
        chocolate.add("Dairymilk");
        chocolate.add("KitKat");
        chocolate.add("5Star");
        chocolate.add("MangoBite");
        chocolate.add("KachaAam");
        chocolate.add("KachaAam");  // duplicate will be ignored

        // TreeSet stores elements in sorted order
        System.out.println("Set after adding elements: " + chocolate);

        // Removing an element
        chocolate.remove("5Star");
        System.out.println("Set after removing '5Star': " + chocolate);

        // Display using enhanced for loop
        for (String choco : chocolate) {
            System.out.println("Chocolate: " + choco);
        }
    }
}
