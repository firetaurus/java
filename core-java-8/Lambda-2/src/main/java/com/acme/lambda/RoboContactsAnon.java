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
public class RoboContactsAnon {
    
    public void phoneContacts(List<Person> pl, MyTest<Person> aTest){
        for(Person p: pl){
            if(aTest.test(p)){
                roboCall(p);
            }
        }
    }
    
    public void emailContacts(List<Person> pl, MyTest<Person> aTest){
        for(Person p: pl){
            if(aTest.test(p)){
                roboEmail(p);
            }
        }
    }
    
    public void mailContacts(List<Person> pl, MyTest<Person> aTest){
        for(Person p: pl){
            if(aTest.test(p)){
                roboMail(p);
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
