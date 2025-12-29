package part2_Collections.hashMap;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class HashMapp {
    public static void main(String[] args) {

        HashMap<String,Integer> ages = new HashMap<>();

        ages.put("Atakan",24);
        ages.put("Engin",27);
        ages.put("Alikaan",27);

        System.out.println(ages);

        System.out.println("I am " + ages.get("Atakan") + " years old.");

        ages.put("Atakan",25);
        System.out.println("I will " + ages.get("Atakan"));

        System.out.println("Contains key Engin ? " + ages.get("Engin"));
        System.out.println("Contains value 27 ? " + ages.containsValue(27));

        ages.remove("Alikaan");
        System.out.println("Final map: " + ages);

        ages.entrySet().stream()
                .filter(entry -> entry.getValue() >= 25)
                .forEach(System.out::println);

        double averageAge =
                ages.values().stream()
                        .mapToInt(age -> age)
                        .average()
                        .orElse(0);

        System.out.println("Average age: " + averageAge);

        List<String> upperKeys =
                ages.keySet().stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
        System.out.println(upperKeys);

        List<String> sortedByAge =
                ages.entrySet().stream()
                        .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                        .map(entry -> entry.getKey() + ": " + entry.getValue())
                        .toList();

        sortedByAge.forEach(System.out::println);

    }
}
