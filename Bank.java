
public class Bank {

    String bankName;
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;

    Bank(String bankName, int userId, String userName, long accountNumber, String accountType, double balance) {
        this.bankName = bankName;
        this.userId = userId;
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
    }

    void displayUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
    }

    String createAccountSummary() {
        String accountSummary = "Bank Name: " + bankName + "\nUser Name: " + userName + "\nAccount Number: " + accountNumber + "\nAccount Type: " + accountType + "\nBalance: " + balance;
        return accountSummary;
    }

    boolean hasMinimumBalance(double minimumbalance) {
        boolean result = false;
        if (balance >= minimumbalance) {
            result = true;
        }
        return result;
    }

    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    double checkBalance() {
        return balance;
    }

}
