package OOPS;

class Animal1 {
    public static void dog() {
        System.out.println("Bow Bow........!!");
    }
}
class Animal {
    public void cat() {
        System.out.println("Meow Meow.......!!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal1 obj1 = new Animal1();
        obj1.dog();
        Animal obj = new Animal();
        obj.cat();
    }
}









