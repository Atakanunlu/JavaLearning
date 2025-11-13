package day1_OOP.polymorphism;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is in a meeting.");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.30;
    }
}