package Sample2;

import java.util.Scanner;

interface Employee {
    void getDetails();
    void showDetails();
}

class EmployeeDetails implements Employee {
    int emp_id;
    String emp_name;
    double emp_sal;
    String emp_loc;
    String emp_phone;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        emp_id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        emp_name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        emp_sal = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Location: ");
        emp_loc = sc.nextLine();

        System.out.print("Enter Employee Phone: ");
        emp_phone = sc.nextLine();
    }

    public void showDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + emp_id);
        System.out.println("Name: " + emp_name);
        System.out.println("Salary: " + emp_sal);
        System.out.println("Location: " + emp_loc);
        System.out.println("Phone: " + emp_phone);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails();
        emp.getDetails();
        emp.showDetails();
    }
}
