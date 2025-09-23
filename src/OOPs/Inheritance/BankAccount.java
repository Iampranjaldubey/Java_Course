package OOPs.Inheritance;

public class BankAccount{
    private long accountNumber;
    private int interestRate;
    private long balance;

    // Getter and Setter
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public long getBalance() {
        return balance;
    }
    public long setBalance(long balance){
        this.balance = balance;
        return this.balance;
    }

    public void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid");
        }
    }
}
