package Scanner;

import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private long balance;

    // Constructor
    public BankAccount(long accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter and Setter
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid");
        }
    }

    // Withdraw method
    public void withdraw(long amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid");
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method with menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(123456789, 0);

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    long depAmt = sc.nextLong();
                    acc.deposit(depAmt);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    long wAmt = sc.nextLong();
                    acc.withdraw(wAmt);
                    break;
                case 3:
                    acc.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
