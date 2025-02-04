import java.io.*;
import java.util.*;

public class rk {
    public static  void main(String[] args) {
        int a;
        float b;
        char c;
        String d;

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the value for a: ");
        a = Sc.nextInt();

        System.out.println("Enter the value for b: ");
        b = Sc.nextFloat();

        System.out.println("Enter the value for c: ");
        c = Sc.next().charAt(0);

        System.out.println("Enter the value for d: ");
        d = Sc.next();

        System.out.println("The values entered are: a = " + a + ", b = " + b);

        Sc.close();
    }
}

