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
public class RoboContactMethods2 {

    public void callDrivers(List<Person> pl) {
        for (Person p : pl) {
            if (isDriver(p)) {
                roboCall(p);
            }
        }
    }

    public void emailDraftee(List<Person> pl) {
        for (Person p : pl) {
            if (isDraftee(p)) {
                roboEmail(p);
            }
        }
    }

    public void mailPilots(List<Person> pl) {
        for (Person p : pl) {
            if (isPilot(p)) {
                roboMail(p);
            }
        }
    }

    private boolean isDriver(Person p) {
        return p.getAge() >= 16;
    }

    private boolean isDraftee(Person p) {
        return p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
    }

    private boolean isPilot(Person p) {
        return p.getAge() >= 23 && p.getAge() <= 65;
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
