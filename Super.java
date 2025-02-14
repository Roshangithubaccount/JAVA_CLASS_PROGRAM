package super_key;

public class Super { // user-defined class
    String name;

    Super(String name) { // constructor
        this.name = name;
        System.out.println("My name in constructor: " + this.name);
    }

    public Super() {
        
    }

    class Child extends Super { // Child class extending Super
        Child(String name) {
            super(name); // calling the parent class constructor
            System.out.println("My name in constructor child: " + this.name);
        }
    }

    public static void main(String[] args) {
        Super s = new Super("Roshan");
        Super.Child c = new Super().new Child("child");
    }
}

