
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("    WELCOME TO BANK MANAGEMENT SYSTEM");
        System.out.println("-------------------------------------------");

        System.out.print("\nEnter Bank Name: ");
        String bankName = scan.nextLine();

        System.out.print("Enter User ID: ");
        int userId = scan.nextInt();

        scan.nextLine();
        System.out.print("Enter User Name: ");
        String userName = scan.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = scan.nextLong();

        scan.nextLine();
        System.out.print("Enter Account Type: ");
        String accountType = scan.nextLine();

        System.out.print("Enter opening Balance: ");
        double balance = scan.nextDouble();

        Bank bank = new Bank(bankName, userId, userName, accountNumber, accountType, balance);

        System.out.println("\n--------Bank & Account Details--------");
        bank.displayBankDetails();
        bank.displayUserDetails();
        bank.displayAccountDetails();

        System.out.println("----------Account Summary-----------");
        System.out.println(bank.createAccountSummary());

        System.out.print("\nEnter Minimum Balance to check: ");
        double minBalance = scan.nextDouble();
        if (bank.hasMinimumBalance(minBalance)) {
            System.out.println("Minimum balance is maintained.");
        } else {
            System.out.println("Minimum balance is not maintained.");
        }

        scan.close();
    }
}
