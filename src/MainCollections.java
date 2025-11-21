import day2_Collections.arrayList.UserStream;
import day2_Collections.hashMap.CustomerManager;
import day2_Collections.linkedList.Task;
import day2_Collections.linkedList.TaskManager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainCollections {
    public static void main(String[] args) {

        System.out.println("---ARRAYLIST---");
        List<UserStream.User> users = new ArrayList<>();

        users.add(new UserStream.User("Atakan",24,"Marmaris"));
        users.add(new UserStream.User("Engin",27,"İzmir"));
        users.add(new UserStream.User("Alikaan",27,"Marmaris"));
        users.add(new UserStream.User("Şakir",28,"Borkum"));
        users.add(new UserStream.User("Bedirhan",16,"Marmaris"));

        List<String> adultNames =
                users.stream()
                        .filter(u-> u.getAge() >= 18)
                        .map(UserStream.User::getName)
                        .collect(Collectors.toList());

        System.out.println("Adult names: " + adultNames);

        users.stream()
                .filter(u -> u.getCity().equals("Marmaris"))
                .filter(u ->u.getAge() >=18)
                .forEach(System.out::println);
        boolean anyOrderThan27 =
        users.stream()
                .anyMatch(u -> u.getAge() >27);
        System.out.println("Any user older than 27 ? " + anyOrderThan27);

        System.out.println("---LINKEDLIST---");

        TaskManager manager = new TaskManager();

        manager.addTask("Code review", 3);
        manager.addTask("Check emails", 1);
        manager.addTask("Write documentation", 3);

        manager.addHighPriorityTask("Fix production bug", 5);
        manager.addHighPriorityTask("Client meeting", 4);

        manager.printAllTasks();

        System.out.println("--- NEXT TASK --- ");
        Task next = manager.getNextTask();
        System.out.println("Next: " + next);

        System.out.println("--- TASKS WITH PRIORITY >= 3 ---");
        manager.getTasksWithMinPriority(3)
                .forEach(System.out::println);

        System.out.println("Has very high priority task? " + manager.hasVeryHighPriorityTask());
        System.out.println("Average priority: " + manager.getAveragePriority());


        System.out.println("---HASHMAP---");

        CustomerManager customerManager = new CustomerManager();

        customerManager.addCustomer(1,"Atakan",24);
        customerManager.addCustomer(2,"Alikaan",25);
        customerManager.addCustomer(3,"Engin",26);
        customerManager.addCustomer(4,"Can",24);
        customerManager.addCustomer(5,"Şakir",28);
        customerManager.addCustomer(6,"Bedirhan",18);

        System.out.println("--- ALL CUSTOMERS---");
        customerManager.printAllCustomers();

        System.out.println("---ADULTS---");
        customerManager.getAdults().forEach(System.out::println);

        System.out.println("---SORTED BY AGE---");
        customerManager.getSortedByAge().forEach(System.out::println);

        System.out.println("Average age: " + customerManager.getAverageAge());

        System.out.println("---REMOVE CUSTOMER---");
        customerManager.removeCustomer(4);

        System.out.println("--- UPDATED ALL CUSTOMERS---");
        customerManager.printAllCustomers();


    }
}
