package multithreading;

public class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount(String accountName) {
        this.accountName = accountName;
        this.balance = 0.0;
    }

    public synchronized void depositMoney(double depositAmount) {
        balance += depositAmount;
        System.out.println(Thread.currentThread().getName() + " deposited " + depositAmount + " to " + accountName);
        System.out.println("Current balance is " + balance);
    }
}
