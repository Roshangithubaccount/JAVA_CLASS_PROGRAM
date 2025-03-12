package sample;
import java.util.Scanner;
 class Whatsapp {
    private String phoneNumber;
    private String otp;

    void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        phoneNumber = sc.nextLine();
        System.out.print("Enter OTP: ");
        otp = sc.nextLine();
    }

    void openApp() {
        while (true) {
            if (phoneNumber.equals("987654321") && otp.equals("1234")) {
                System.out.println("WhatsApp is opened!");
                break;
            } else {
                System.out.println("Invalid phone number or OTP. Try again.");
                userInput();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to WhatsApp!");
        Whatsapp app = new Whatsapp();
        app.userInput();
        app.openApp();
    }
}
