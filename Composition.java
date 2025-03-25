package Sample2;

class  Engine{// parent1 class
    void start(){
        System.out.println("Engine is Starting");
    }

}
class Car { // parent2 class
    Engine e = new Engine();

    void stop(){
        System.out.println("Engine is stoping....!!");
        e.start();
    }
    void moving(){
        System.out.println("Engine is Moving....!!");
        e.start();
    }
}
public class Composition {
    public static void main(String[] args) {
     Car c = new Car();
     c.stop();
     c.moving();

    }
}
