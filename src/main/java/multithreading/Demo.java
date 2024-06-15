package multithreading;

public class Demo {
    public static void main(String[] args) {
        BankAccount account_1 = new BankAccount("Account 1");
        BankAccount account_2 = new BankAccount("Account 2");

        DepositedThread t1 = new DepositedThread(account_1);
        DepositedThread t2 = new DepositedThread(account_2);

        DepositedRunnable r1 = new DepositedRunnable(account_1);
        DepositedRunnable r2 = new DepositedRunnable(account_2);
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
