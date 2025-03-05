package sample;

import javax.crypto.spec.PSource;

abstract class Animal{// abstract class

   abstract void sound();// abstract method

}
class Dog extends Animal {
    void sound() {
        System.out.println("Bow Bow ...!!");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Mew Mew ...!!");
        }

}


public class Abstraction {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.sound();
        c.sound();
    }

}

