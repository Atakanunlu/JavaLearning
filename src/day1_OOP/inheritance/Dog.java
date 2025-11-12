package day1_OOP.inheritance;

public class Dog extends Animal{

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark(){
        System.out.println(name + " is barking.");
    }

    @Override
    public void eat(){
        System.out.println(name + " is eating dog food.");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Breed:" + breed);
    }


}
