package day1_OOP.polymorphism;

public class Intern extends Employee {

    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is learning.");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.05;
    }
}