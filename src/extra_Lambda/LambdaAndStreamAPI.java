package extra_Lambda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaAndStreamAPI {
    public static void main(String[] args) {


//        Walkable obj = new WalkFast();
//        obj.walk(4);

//        Walkable obj1 = new Walkable() {
//            @Override
//            public int walk(int steps) {
//                return 0;
//            }
//        };

//        Walkable obj = (steps,isEnabled) -> {
//            System.out.println(" walking fast + " + steps +" steps" + isEnabled);
//            return 2*steps;
//
//        };
//
//        Walkable obj2 = (steps, isEnabled) -> 2*steps;
//
//        obj.walk(8,true);


        List<String> fruits = List.of("Apple", "Kiwi","Banana");

        Map<String,Integer> fruitList = fruits.stream()
               // .map(fruit -> fruit.length())
                .collect(Collectors.toMap(
                        fruit -> fruit,
                        String::length
                ));

        System.out.println(fruitList);

       Stream<String> stream = fruits.stream();

//
        stream
                .filter(fruit -> fruit.length() < 12)
                .sorted()
                .map(String::length)
                .map(fruit -> 2*fruit)
                .forEach(System.out::println);

    }

}


//interface Walkable{
//    int walk(int steps,boolean isEnabled);
//}

//class WalkFast implements Walkable{
//
//    @Override
//    public int walk(int steps) {
//        System.out.println(" walking fast + " + steps +" steps");
//        return 2*steps;
//    }
//}
