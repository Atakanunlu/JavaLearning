import day1_OOP.abstraction.CreditCard;
import day1_OOP.abstraction.Payment;
import day1_OOP.abstraction.Paypal;
import day1_OOP.encapsulation.BankAccount;
import day1_OOP.inheritance.Cat;
import day1_OOP.inheritance.Dog;

public class MainOOP {
    public static void main(String[] args) {


        System.out.println("-------------------------INHERITANCE----------------------");
        Dog dog = new Dog("Daisy" , 15 ,"Golden");
        Cat cat = new Cat("Pofi", 5,true);

        dog.bark();
        dog.eat();
        dog.sleep();
        dog.displayInfo();

        cat.eat();
        cat.meow();
        cat.sleep();
        cat.displayInfo();

        //----------------------INHERITANCE----------------------------

        System.out.println("--------------------- ENCAPSULATION -----------------------");

        BankAccount account = new BankAccount("TR123456", "Atakan Unlu");

        account.deposit(5000);
        account.withdraw(2000);

        System.out.println("Current balance: " + account.getBalance());

        System.out.println("\n--- ERROR SCENARIOS ---");
        account.deposit(-122);
        account.withdraw(100000);

        System.out.println("\n--- CLOSING ACCOUNT ---");
        account.closeAccount();
        account.withdraw(3000);
        account.withdraw(3000);  // Withdraw remaining
        account.closeAccount();
        account.deposit(100);

        account.displayAccountInfo();

        //------------------------------ENCAPSULATION------------------------------

        System.out.println("---------------------ABSTRACTION---------------------------------");

        System.out.println("---CREDITCARD---");
        CreditCard card = new CreditCard("Atakan", 2000);
        card.showBalance();
        card.pay(400);
        card.showBalance();

        System.out.println("---PAYPAL---");
        Paypal paypal = new Paypal("Atakan2",1000);

        paypal.showBalance();
        paypal.pay(800);
        paypal.refund(300);
        paypal.showBalance();

    }
}
