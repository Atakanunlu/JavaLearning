package day2_Collections.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListt {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Atakan");
        names.add("Engin");
        names.add("Şakir");
        names.add("Can");
        names.add("Alikaan");
        names.add("Semih");
        names.add("Cabi");

        System.out.println("Size: " + names.size());

        System.out.println("First element: " + names.get(0) );

        names.set(1,"Engin Utku");

        System.out.println("Names: " + names);

        System.out.println("Constains 'Atakan' ? " + names.contains("Atakan"));

        System.out.println(names.isEmpty());

        //names.clear();
        //System.out.println(names.isEmpty());


        System.out.println("---CLASSIC FOR LOOP---");
        for (int i = 0; i < names.size(); i++){
            System.out.println(i+ "-> "+ names.get(i));
        }

        System.out.println("--- FOR-EACH---");
        for (String name: names){
            System.out.println(name);
        }

        System.out.println("--- NAMES STARTING WITH 'A' TO UPPERCASE ---");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


        System.out.println("--- SQUARE EVEN NUMBERS AND PRINT ---");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        List<Integer> evenSquares =
                numbers.stream()
                        .filter(number -> number % 2 ==0)
                        .map(number -> number * number)
                        .collect(Collectors.toList());
        System.out.println(evenSquares);

        int sum = numbers.stream()
                .mapToInt(n->n)
                .sum();
        double avg = numbers.stream()
                .mapToInt(n-> n)
                .average()
                .orElse(0);
        long count = numbers.stream().count();

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
        System.out.println("count: " + count);

    }

}
