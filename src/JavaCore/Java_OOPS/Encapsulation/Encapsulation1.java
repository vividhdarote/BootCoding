package JavaCore.Java_OOPS.Encapsulation;

// Encapsulated class

class BankAccount {

    // Private fields (data hiding)
    private String accountNumber;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Setter to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("87181", 1000.0);

        // Access balance using getter (controlled access)
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit money
        account.deposit(500);
        System.out.println("Updated Balance: " + account.getBalance());

        // Withdraw money
        account.withdraw(300);
        System.out.println("Updated Balance: " + account.getBalance());

        // Trying to directly access private fields (This will cause an error)
        // account.balance = 5000; // ❌ Error: balance has private access
    }
}
