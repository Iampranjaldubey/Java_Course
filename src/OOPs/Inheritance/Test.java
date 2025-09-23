package OOPs.Inheritance;
public class Test {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        System.out.println("BankAccount Balance: " + ba.getBalance());

        SavingsAccount sa = new SavingsAccount();
        sa.deposit(1500);
        sa.withdraw(1200);
        System.out.println("SavingsAccount Balance: " + sa.getBalance());
    }
}
