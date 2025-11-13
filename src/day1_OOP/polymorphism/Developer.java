package day1_OOP.polymorphism;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is writing code.");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }
}