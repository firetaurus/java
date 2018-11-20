=== A Common Query Use Case ===

A common use case for programs is to search through a collection of data to find items that match a specific criteria. In the excellent "Jump-Starting Lambda" presentation at JavaOne 2012, Stuart Marks and Mike Duigou walk though just such a use case. Given a list of people, various criteria are used to make robo calls (automated phone calls) to matching persons. This tutorial follows that basic premise with slight variations.

In this example, our message needs to get out to three different groups in the United States:

    Drivers: Persons over the age of 16
    Draftees: Male persons between the ages of 18 and 25
    Pilots (specifically commercial pilots): Persons between the ages of 23 and 65

The actual robo that does all this work has not yet arrived at our place of business. Instead of calling, mailing or emailing, a message is printed to the console. The message contains a person's name, age, and information specific to the target medium (for example, email address when emailing or phone number when calling).With a Person class and search criteria

Class creation order
+ Person.java 
+ Gender.java
+ RoboCallMethods.java
+ RoboCallTest01.java
+ RoboCallMethods2.java
+ RoboCallTest02.java
+ Test Interface.java
+ RoboContactsAnon.java
+ RoboCallTest03.java
+ Predicate.java
+ RoboContactsLambda.java
+ RoboCallTest04.java
