package day1_OOP.abstraction;

public abstract class Payment implements Payable {
    protected String username;
    protected double balance;

    public Payment(String username, double balance) {
        this.username = username;
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println(username + " - Balance: " + balance);
    }

    @Override
    public abstract void pay(double amount);
}