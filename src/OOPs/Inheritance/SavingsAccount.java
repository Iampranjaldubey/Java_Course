package OOPs.Inheritance;

public class SavingsAccount extends BankAccount {
    public void withdraw(long amount) {
        if (amount > 0L && amount <= this.getBalance()) {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }

    }
}

