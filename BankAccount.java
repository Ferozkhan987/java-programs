import java.util.*;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 5000);
        account.deposit(2000);
        account.withdraw(1000);
        account.displayBalance();
    }
}
