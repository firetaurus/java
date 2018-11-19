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
public class RoboContactMethods {

    public void callDrivers(List<Person> pl) {
        for (Person person : pl) {
            if (person.getAge() >= 16) {
                roboCall(person);
            }
        }
    }

    public void emailDraftees(List<Person> pl) {
        for (Person person : pl) {
            if (person.getAge() >= 18 && person.getAge() <= 25 && person.getGender() == Gender.MALE) {
                roboEmail(person);
            }
        }
    }
    
    public void mailPilots(List<Person> pl) {
        for (Person person : pl) {
            if (person.getAge() >= 23 && person.getAge() <= 65) {
                roboMail(person);
            }
        }
    }
    

    private void roboCall(Person person) {
        System.out.println("Calling " + person.getGivenName() + " "
                + person.getSurName() + " age " + person.getAge()
                + " at " + person.getPhone());
    }

    private void roboEmail(Person person) {
        System.out.println("EMailing " + person.getGivenName() + " "
                + person.getSurName() + " age " + person.getAge()
                + " at " + person.getEmail());
    }

    private void roboMail(Person person) {
        System.out.println("Mailing " + person.getGivenName() + " "
                + person.getSurName() + " age " + person.getAge()
                + " at " + person.getAddress());
    }

}
