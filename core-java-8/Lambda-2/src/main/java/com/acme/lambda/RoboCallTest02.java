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
public class RoboCallTest02 {
    
    public static void main(String[] args) {

        List<Person> pl = Person.createShortList();
        RoboContactMethods2 robo = new RoboContactMethods2();

        System.out.println("\n==== Test 02 =====");
        System.out.println("\n=== Calling all Drivers ====");
        robo.callDrivers(pl);
        
        System.out.println("\n=== Emailing all Draftess ====");
        robo.emailDraftees(pl);
        
        System.out.println("\n=== Mailing all Pilots ====");
        robo.mailPilots(pl);
    }
    
}
