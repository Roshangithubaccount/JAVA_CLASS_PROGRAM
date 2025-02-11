public class Static_method {  // Renamed class to follow naming conventions

    static int a = 100;  // Static variable
    int b = 200;         // Instance (Non-static) variable

    // Static method
    public static void static_method() {
        System.out.println("Inside Static Method");


        System.out.println("Static variable a: " + a);


        Static_method obj = new Static_method();
        System.out.println("Non-static variable b (accessed via object): " + obj.b);
    }


    public void nonStatic_method() {
        System.out.println("Inside Non-Static Method");

        System.out.println("Static variable a: " + a);
        System.out.println("Non-static variable b: " + b);
    }

    public static void main(String[] args) {

        static_method();


        Static_method obj = new Static_method();
        obj.nonStatic_method();
    }
}

