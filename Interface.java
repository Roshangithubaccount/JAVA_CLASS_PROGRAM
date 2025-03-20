package Sample2;

import java.sql.SQLOutput;

interface  Animal{
   abstract void sound();
}
class Horse implements  Animal{
    public void sound(){
        System.out.println("Woof Woof");
    }
}
class Tiger implements  Animal{
    public void sound(){
        System.out.println("tu tu ");
    }
}
public class Interface {
    public static void main(String[] args) {
        Horse h = new Horse();
        Tiger t = new Tiger();
        t.sound();
        h.sound();
    }
}
