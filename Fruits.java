class Fruits {
    Fruits(){                  // Default constructor
        System.out.println("I  am Fruit Constructor");
    }
    Fruits (String name){       // Parametrised Constructor
        System.out.println(" Fruit Name is :"+name);
    }
}
class Main {
    public static void main(String[] args) {
        Fruits obj = new Fruits("orange");
    }
}
