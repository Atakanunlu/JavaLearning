package part2_Collections.hashMap;

public class Customer {
    private int id;
    private String name;
    private int age;

    public Customer(int id, String name, int age){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Customer{id = " + id + ", Name = { " + name + " }" + ", age: " +age +" }";
    }

}
