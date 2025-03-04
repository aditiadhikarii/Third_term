import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String PIN = "1029";
        int attempts = 0;
        int balance = 25000;


        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            String pin = scanner.nextLine();


            if (pin.equals(PIN)) {
                System.out.println("Entered PIN is valid");
                System.out.print("Enter amount to withdraw: ");
                int amount = scanner.nextInt();


                if (amount > balance) {
                    System.out.println("Insufficient amount!");
                } else if (amount <= 0) {
                    System.out.println("Invalid input!");
                } else {
                    balance -= amount;
                    System.out.print("Withdrawal successful, Your new balance is: ", balance);
                }
                return;
            } else {
                attempts++;
                System.out.println("PIN is incorrect, Attempts left: " + (3 - attempts));
            }
        }
        System.out.println("Too many inputs, Account Locked!!!");
        scanner.close();
    }

