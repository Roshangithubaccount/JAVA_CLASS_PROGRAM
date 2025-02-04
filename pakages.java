package Pakages;
import java.util.Scanner;

/*public class pakages {
    public static void main(String[] args) {
        int a= 100;
        System.out.println(a);
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your b value");
        int b= s.nextInt();
        System.out.println(b);
    }
}*/


/*public class pakages {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your name");
        String b= s.nextLine();
        System.out.println("My name is "+b);
    }
}*/

public class pakages{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student id: ");
        int ID = scanner.nextInt();

        System.out.print("Enter Student std ");
        scanner.nextLine();
        String std = scanner.nextLine();

        System.out.print("Enter Student sloc: ");
        String sloc = scanner.nextLine();

        // Printing student details
        System.out.println("\nStudent Details:");
        System.out.println("my name is: " + name);
        System.out.println("student ID is: " + ID);
        System.out.println("Std is : " + std);
        System.out.println("sloc is : " + sloc);

        // Closing scanner
        scanner.close();
    }
}


