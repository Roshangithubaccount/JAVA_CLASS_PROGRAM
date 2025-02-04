package Basic;
import java.io.*;
import java.util.*;

public class studentdetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a first name");
        String firstName = sc.next();

        System.out.println("Enter last name ");
        String lastName=sc.next();

        System.out.println("enter id");
        int id =sc.nextInt();

        System.out.println("enter the cgpa");
        float cgpa= sc.nextFloat();

        System.out.println("enter the ha");
        float ha= sc.nextInt();

        System.out.println("Name: "+firstName+ " "+ lastName);
        System.out.println("Id: "+id);
        System.out.println("CGPA :"+cgpa);
        System.out.println("HA :"+ha);

    }
}
