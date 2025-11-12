import day1_OOP.inheritance.Cat;
import day1_OOP.inheritance.Dog;

public class MainOOP {
    public static void main(String[] args) {
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

    }
}
