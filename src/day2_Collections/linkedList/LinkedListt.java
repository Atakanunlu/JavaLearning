package day2_Collections.linkedList;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListt {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Atakan");
        names.add("Engin");
        names.add("Şakir");

        names.addFirst("First");
        names.addLast("Last");
        System.out.println(names);

        System.out.println("Firstable: " + names.getFirst());
        System.out.println("Lastable: " + names.getLast());

        System.out.println("---NUMBERS---");

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.addFirst(5);
        numbers.addFirst(3);
        numbers.addFirst(1);
        numbers.addLast(10);
        numbers.addLast(15);
        numbers.addLast(20);
        numbers.add(30);

        List<Integer> greaterThan10 =
                numbers.stream()
                        .filter(n -> n > 10)
                        .collect(Collectors.toList());
        System.out.println("Greater than 10: " + greaterThan10);

        System.out.println("---QUE---");

        Deque<String> tasks = new LinkedList<>();
        tasks.offer("Task-1");
        tasks.offer("Task-2");
        tasks.offer("Task-3");

        System.out.println("Next: " + tasks.peek());

        System.out.println("Done: " + tasks.poll());
        System.out.println("Done: " + tasks.poll());

        System.out.println("Last: " + tasks);

    }
}
