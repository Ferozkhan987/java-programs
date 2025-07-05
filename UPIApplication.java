import java.util.HashMap;
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String owner;
    private String upiPin;
    private double balance;

    public BankAccount(String accountNumber, String owner, String upiPin) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.upiPin = upiPin;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public boolean authenticate(String pin) {
        return this.upiPin.equals(pin);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("✅ Deposited ₹" + amount + " to " + owner + "'s account.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Withdraw amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("❌ Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("✅ Withdrew ₹" + amount + " from " + owner + "'s account.");
    }

    public void transfer(BankAccount target, double amount) {
        if (amount <= 0) {
            System.out.println("❌ Transfer amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("❌ Insufficient balance for transfer.");
            return;
        }
        this.withdraw(amount);
        target.deposit(amount);
        System.out.println("✅ Transferred ₹" + amount + " from " + this.owner + " to " + target.getOwner());
    }

    public void showBalance() {
        System.out.println("💰 " + owner + "'s balance: ₹" + balance);
    }
}

public class UPIApplication {
    private static HashMap<String, BankAccount> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== UPI Application Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Login to Account");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    BankAccount user = authenticate();
                    if (user != null) {
                        accountMenu(user);
                    }
                    break;
                case "3":
                    System.out.println("👋 Exiting UPI Application. Thank you!");
                    return;
                default:
                    System.out.println("❌ Invalid option. Try again.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter new account number: ");
        String accNo = scanner.nextLine();
        if (accounts.containsKey(accNo)) {
            System.out.println("❌ Account number already exists.");
            return;
        }

        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();

        System.out.print("Set a 4-digit UPI PIN: ");
        String pin = scanner.nextLine();

        BankAccount account = new BankAccount(accNo, name, pin);
        accounts.put(accNo, account);
        System.out.println("✅ Account created successfully for " + name);
    }

    private static BankAccount authenticate() {
        System.out.print("Enter your account number: ");
        String accNo = scanner.nextLine();
        BankAccount account = accounts.get(accNo);

        if (account == null) {
            System.out.println("❌ Account not found.");
            return null;
        }

        System.out.print("Enter your UPI PIN: ");
        String pin = scanner.nextLine();

        if (account.authenticate(pin)) {
            System.out.println("✅ Welcome, " + account.getOwner() + "!");
            return account;
        } else {
            System.out.println("❌ Authentication failed.");
            return null;
        }
    }

    private static void accountMenu(BankAccount user) {
        while (true) {
            System.out.println("\n---- Welcome " + user.getOwner() + " ----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer Money");
            System.out.println("4. Show Balance");
            System.out.println("5. Logout");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter amount to deposit: ₹");
                    double depAmt = Double.parseDouble(scanner.nextLine());
                    user.deposit(depAmt);
                    break;
                case "2":
                    System.out.print("Enter amount to withdraw: ₹");
                    double withAmt = Double.parseDouble(scanner.nextLine());
                    user.withdraw(withAmt);
                    break;
                case "3":
                    System.out.print("Enter target account number: ");
                    String targetAccNo = scanner.nextLine();
                    BankAccount target = accounts.get(targetAccNo);
                    if (target != null) {
                        System.out.print("Enter amount to transfer: ₹");
                        double transAmt = Double.parseDouble(scanner.nextLine());
                        user.transfer(target, transAmt);
                    } else {
                        System.out.println("❌ Target account not found.");
                    }
                    break;
                case "4":
                    user.showBalance();
                    break;
                case "5":
                    System.out.println("🔒 Logged out.");
                    return;
                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}
