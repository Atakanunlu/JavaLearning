package part6_GenericsAndWrapperClasses;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        Dog<String,String> d1 = new Dog<>("daisy123","Chese");
        Dog<String,Integer> d2 = new Dog<>("daisy123456",123);

        Dog<Integer,String> d3 = new Dog<>(11,"Chese");

        System.out.println(d3.getId());

        ArrayList<Integer> a = new ArrayList<>();
    }
}

class Dog<E,V>{
    E id;

    V name;
    public Dog(E id,V name){
        this.id = id;
        this.name = name;
    }

    E getId(){
        return id;
    }
}
