/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.lambda;

import java.util.List;

/**
 *
 * @author aldus
 */
public class RoboCallTest03 {

    public static void main(String[] args) {
        List<Person> pl = Person.createShortList();
        RoboContactsAnon robo = new RoboContactsAnon();
        
        System.out.println("\n==== Test 03 ====");
        System.out.println("\n=== Call all Drivers ===");
        robo.phoneContacts(pl, new MyTest<Person>() {
            @Override
            public boolean test(Person p) {
                return p.getAge() >= 16;
            }
        });
        
        System.out.println("\n=== Emailing all Draftees ===");
        robo.emailContacts(pl, new MyTest<Person>() {
            @Override
            public boolean test(Person p) {
                return p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE; 
            }
        });
        
        System.out.println("\n=== Mail all Pilots ===");
        robo.mailContacts(pl, new MyTest<Person>() {
            @Override
            public boolean test(Person p) {
                return p.getAge() >= 23 && p.getAge() <= 65; 
            }
        });
    }

}
