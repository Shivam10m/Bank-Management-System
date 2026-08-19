
import java.util.Scanner;

public class BankApplication2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Bank[] bank = new Bank[2];
        int choice;
        do {
            System.out.println("-------------------------------------------");
            System.out.println("    WELCOME TO BANK MANAGEMENT SYSTEM");
            System.out.println("-------------------------------------------");
            System.out.println();

            System.out.print("Enter Bank Name: ");
            String bankName = scan.nextLine();

            System.out.print("Enter User ID: ");
            int userId = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter User Name: ");
            String userName = scan.nextLine();

            System.out.println();
            System.out.print("Enter Account Number: ");
            long accountNumber = scan.nextLong();
            scan.nextLine();

            System.out.print("Enter Account Type: ");
            String accountType = scan.nextLine();

            double balance;
            do {
                System.out.print("Enter Opening Balance: ");
                balance = scan.nextDouble();
                if (balance <= 0) {
                    System.out.println("Invalid balance.");
                    System.out.println("\nPlease Enter balance above 0.");
                }
            } while (balance <= 0);

            Bank bank = new Bank(bankName, userId, userName, accountNumber, accountType, balance);

            int userChoice;
            do {
                do {
                    System.out.println("\n-------------- MENU ---------------");
                    System.out.println("What You want to do?");
                    System.out.println("\n0.Exit\n1.Display Complete Details\n2.Deposit Amount\n3.Withdraw Amount\n4.Check Balance\n5.View Account Summary\n6.Check Minimum Balance");

                    System.out.print("\nEnter your choice: ");
                    userChoice = scan.nextInt();

                    if (userChoice > 6 || userChoice < 0) {
                        System.out.println("Invalid choice.");
                        System.out.println("Please enter a value between 0 and 6.\n");
                    }
                } while (userChoice > 6 || userChoice < 0);
                switch (userChoice) {
                    case 1:
                        System.out.println("\n----------- Complete Details ----------");
                        bank.displayBankDetails();
                        bank.displayUserDetails();
                        bank.displayAccountDetails();
                        break;

                    case 2:
                        System.out.println("\n---------- Deposit Amount -----------");
                        System.out.print("Enter amount you want to deposit: ");
                        double depositAmount = scan.nextDouble();
                        if (bank.deposit(depositAmount)) {
                            System.out.println("Deposited Successfully");
                        } else {
                            System.out.println("Deposit Failed");
                        }
                        break;

                    case 3:
                        System.out.println("\n--------- Withdraw Amount ---------");
                        System.out.print("Enter amount you want to withdraw: ");
                        double withdrawAmount = scan.nextDouble();
                        if (bank.withdraw(withdrawAmount)) {
                            System.out.println("Withdrawl Successfully");
                        } else {
                            System.out.println("Withdrawl Failed");
                        }
                        break;

                    case 4:
                        System.out.println("\n--------- Current Balance ---------");
                        System.out.println("Balance: " + bank.checkBalance());
                        break;

                    case 5:
                        System.out.println("\n--------- Account Summary ---------");
                        System.out.println(bank.createAccountSummary());
                        break;

                    case 6:
                        System.out.print("\nEnter Minimum Balance to check: ");
                        double minBalance = scan.nextDouble();

                        System.out.println("\n----- Minimum Balance Status ------");
                        if (bank.hasMinimumBalance(minBalance)) {
                            System.out.println("Minimum balance is maintained.");
                        } else {
                            System.out.println("Minimum balance is not maintained.");
                        }
                        break;

                }
            } while (userChoice != 0);

            System.out.println();
            do {
                System.out.println("Would you like to enter another user data? ");
                System.out.println("1.Yes\n2.No\n");
                System.out.print("Enter your choice: ");
                choice = scan.nextInt();
                scan.nextLine();
                if (true) {
                    System.out.println("Invalid choice.");
                    System.out.println("Please enter a valid choice.\n");
                }
            } while (choice > 2 || choice < 1);
            System.out.println();
        } while (choice != 2);
        System.out.println("Thank you for using Bank Manager App.\n");
        scan.close();
    }
}
