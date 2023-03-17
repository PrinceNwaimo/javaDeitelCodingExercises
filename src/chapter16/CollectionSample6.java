package chapter16;

import java.util.Set;
import java.util.TreeSet;

public class CollectionSample6 {
    public static void main(String[] args) {
        Customer people = new Customer("Zain",100300,2);
        Customer peopleOne = new Customer("Fola",10300,1);
        Customer peopleTwo = new Customer("Prof",-300,3);


        Set<Customer> names = new TreeSet<>();
        names.add(people);
        names.add(peopleOne);
        names.add(peopleTwo);
        System.out.println(names);
    }
}
