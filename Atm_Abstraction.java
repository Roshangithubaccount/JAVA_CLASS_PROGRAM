import java.util.Scanner;

abstract class ATM {
    double balance;

    ATM(double balance) { // Parent constructor
        this.balance = balance;
    }

    abstract void withDraw(double amount);
    abstract void deposit(double amount);
    abstract void checkBal();
}

class SBI extends ATM {  // Child class
    SBI(double balance) { // Child constructor
        super(balance);
    }

    // Withdraw method
    void withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successfully, Available balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Deposit Method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful, Available balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    void checkBal() {
        System.out.println("Current balance: " + balance);
    }
}

public class Atm_Abstraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SBI obj = new SBI(1000); // Initial amount

        while (true) {
            System.out.println("ATM -------Menu");
            System.out.println("1. Withdraw money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("-----------------------------------");
            System.out.print("Enter Your Choice: ");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to Withdraw: ");
                    double with_amt = s.nextDouble();
                    obj.withDraw(with_amt);
                    break;

                case 2:
                    System.out.print("Enter amount to Deposit: ");
                    double depo_amt = s.nextDouble();
                    obj.deposit(depo_amt);
                    break;

                case 3:
                    obj.checkBal();
                    break;

                case 4:
                    System.out.println("Thank you for using SBI ATM.!!");
                    s.close();
                    return;

                default:
                    System.out.println("Enter a valid choice.....");
            }
        }
    }
}
