package day2_Collections.hashMap;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerManager {

    private HashMap<Integer, Customer> customers = new HashMap<>();

    public void addCustomer(int id , String name, int age){
        customers.put(id, new Customer(id, name, age));
    }

    public void getCustomer(int id){
        customers.get(id);
    }

    public void removeCustomer(int id){
        customers.remove(id);
    }

    public void printAllCustomers(){
        customers.values().forEach(System.out::println);
    }

    public List<Customer> getAdults() {
        return customers.values().stream()
                .filter(customer -> customer.getAge() >= 22)
                .collect(Collectors.toList());
    }

    public List<Customer> getSortedByAge(){
        return customers.values().stream()
                .sorted((u1,u2) -> u2.getAge() - u1.getAge())
                .collect(Collectors.toList());
    }

    public double getAverageAge(){
        return customers.values().stream()
                .mapToInt(Customer::getAge)
                .average()
                .orElse(0);
    }

}
