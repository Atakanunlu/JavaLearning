package day1_OOP.inheritance;

public class Cat extends Animal{

    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor){
        super(name,age);
        this.isIndoor = isIndoor;
    }

    public void meow(){
        System.out.println(name + " is meowing.");
    }

    @Override
    public void eat(){
        System.out.println(name + " is eating cat food.");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Is indoor: " + isIndoor);
    }

}
