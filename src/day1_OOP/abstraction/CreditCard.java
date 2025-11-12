package day1_OOP.abstraction;

public class CreditCard extends Payment {
    public CreditCard(String username, double balance) {
        super(username, balance);
    }

    @Override
    public void pay(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Paid " + amount + " via Credit Card.");
    }
}