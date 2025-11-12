package day1_OOP.encapsulation;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String ownerName;
    private boolean isActive;

    public BankAccount(String accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.ownerName = ownerName;
        this.isActive = true;
    }

    public void deposit(double amount){
        if (!isActive){
            System.out.println("Account is closed. Transaction denied.");
            return;
        }

        if (amount <= 0){
            System.out.println("Deposit amount must be greater than 0.");
            return;
        }

        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    public void withdraw(double amount){
        if (!isActive){
            System.out.println("Account is closed. Transaction denied.");
            return;
        }

        if (amount <= 0){
            System.out.println("Withdrawal amount must be greater than 0.");
            return;
        }

        if (amount > balance){
            System.out.println("Insufficient balance. Available: " + balance);
            return;
        }

        if (amount > 10_000){
            System.out.println("Daily withdrawal limit exceeded. Limit: 10,000");
            return;
        }

        balance -= amount;
        System.out.println(amount + " withdrawn. Remaining balance: " + balance);
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void closeAccount(){
        if (balance > 0){
            System.out.println("Cannot close account. Balance: " + balance + ". Withdraw funds first.");
            return;
        }

        isActive = false;
        System.out.println("Account closed successfully.");
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println("Status: " + (isActive ? "Active" : "Closed"));
    }
}