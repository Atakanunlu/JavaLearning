package extra_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {

        System.out.println("---FOR-EACH---");
        List<String> names = List.of("atakan","şakir","engin");
        names.stream()
                .forEach(System.out::println);

        System.out.println("---FILTER---");

        List<Integer> numbers = List.of(15,10,5,25,20,30);

        List<Integer> newNumbers =
            numbers.stream()
                .filter(n ->n > 10 && n %2 == 0)
                .collect(Collectors.toList());
        System.out.println(newNumbers);

        System.out.println("---MAP---");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("---SORTED---");
        names.stream()
                .sorted()
                .forEach(System.out::println);

        List<Integer> sortedNumbers =
                numbers.stream()
                        .sorted(Integer::compare)
                        .toList();
        System.out.println(sortedNumbers);

        System.out.println("---DISTINCT---");
        List<String> cities = List.of("Marmaris","İzmir", "İstanbul","Marmaris","Ankara","İzmir");
        cities.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("---LIMIT,SKIP---");
        List<Integer> numbers2 = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> firstThree =
                numbers2.stream()
                    .limit(3)
                    .collect(Collectors.toList());

        List<Integer> skipFive =
                numbers2.stream()
                        .skip(5)
                        .collect(Collectors.toList());
        System.out.println(firstThree);
        System.out.println(skipFive);

        System.out.println("---ANYMATCH,ALLMATCH,NONEMATCH---");

        boolean anyGreaterThan25 =
                numbers.stream()
                        .anyMatch(n -> n > 25);

        boolean allGreaterThan5 =
                numbers.stream()
                        .allMatch(n -> n >= 5);

        boolean noneGreaterPozitive =
                numbers.stream()
                        .noneMatch(n -> n > 0);
        System.out.println(allGreaterThan5);
        System.out.println(anyGreaterThan25);
        System.out.println(noneGreaterPozitive);


        System.out.println("---FINDFIRST---");
        Optional<String> firstWithA =
                names.stream()
                        .filter(n -> n.startsWith("a"))
                        .findFirst();
        firstWithA.ifPresent(System.out::println);

        System.out.println("---COUNT---");
        long evenCount =
            numbers2.stream()
                 .filter(n -> n % 2 ==0)
                  .count();
        System.out.println("Even count: " + evenCount);

        System.out.println("---MAPTOINT,SUM,AVG---");

        int sum =
                numbers.stream()
                        .mapToInt(n->n)
                        .sum();

        double avg =
                numbers.stream()
                        .mapToInt(n->n)
                        .average()
                        .orElse(0);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);

        System.out.println("---FLATMAP---");

        List<List<String>> phoneGroups = Arrays.asList(
                Arrays.asList("111","222"),
                Arrays.asList("333"),
                Arrays.asList("444","555")
        );

        List<String> allPhones =
                phoneGroups.stream()
                        .flatMap(list -> list.stream())
                        .collect(Collectors.toList());
        System.out.println(allPhones);

    }
}
