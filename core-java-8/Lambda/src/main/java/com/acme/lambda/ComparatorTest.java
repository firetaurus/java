package com.acme.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author aldus
 */
public class ComparatorTest {

    public static void main(String[] args) {

        List<Person> personList = Person.createShortList();

        // Sort with Inner Class
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getSurName().compareTo(p2.getSurName());
            }

        });

        System.err.println("=== Sorted Asc SurName ===");
        for (Person person : personList) {
            person.printName();
        }

        // Use Lambda instead
        //Print Asc
        System.out.println("=== Sorted Asc SurName ===");
        Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));

        for (Person person : personList) {
            person.printName();
        }

        //Print Desc
        System.out.println("=== Sorted Desc SurName ===");
        Collections.sort(personList, (p1, p2) -> p2.getSurName().compareTo(p1.getSurName()));

        for (Person person : personList) {
            person.printName();
        }
    }

}
