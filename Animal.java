class Animal {
Animal() {  // Default constructor
    System.out.println("I am an Animal Constructor");
}

Animal(String name, double price, String breed) {  // Parameterized constructor
    System.out.println("Dog Name: " + name);
    System.out.println("Dog Price: " + price);
    System.out.println("Dog Breed: " + breed);
}
}

class Maine {
    public static void main(String[] args) {
        Animal dog = new Animal("Buddy", 300.50, "Golden Retriever"); // Calls parameterized constructor
    }
}
