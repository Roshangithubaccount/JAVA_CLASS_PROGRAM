package ExceptionHandling; // Package name should be in lowercase (Java convention)

public class FlowerExceptionHandling {
    public static void main(String[] args) {
        // Creating an array of 15 flowers
        String[] flowers = {
                "Rose", "Lily", "Tulip", "Daisy", "Sunflower",
                "Orchid", "Jasmine", "Marigold", "Lavender", "Daffodil",
                "Chrysanthemum", "Hibiscus", "Peony", "Lotus", "Carnation"
        };

        try {
            // Attempting to access an index out of bounds
            System.out.println("Flower at index 15: " + flowers[15]); // Error: Index 15 is out of bounds (valid range: 0-14)
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Exception Caught: " + e);
            System.out.println("You tried to access an invalid index in the flower array.");
        } finally {
            // This block always executes
            System.out.println("Finally block executed: Flower array contains " + flowers.length + " elements.");
        }

        System.out.println("Program execution continues normally...");
    }
}
