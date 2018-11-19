/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    }

}
