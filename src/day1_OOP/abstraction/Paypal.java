package day1_OOP.abstraction;

public class Paypal extends Payment implements Refundable {
    public Paypal(String username, double balance) {
        super(username, balance);
    }

    @Override
    public void pay(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Paid " + amount + " via PayPal.");
    }

    @Override
    public void refund(double amount) {
        balance += amount;
        System.out.println("Refunded " + amount);
    }
}