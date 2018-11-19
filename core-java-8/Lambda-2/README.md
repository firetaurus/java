=== A Common Query Use Case ===

A common use case for programs is to search through a collection of data to find items that match a specific criteria. In the excellent "Jump-Starting Lambda" presentation at JavaOne 2012, Stuart Marks and Mike Duigou walk though just such a use case. Given a list of people, various criteria are used to make robo calls (automated phone calls) to matching persons. This tutorial follows that basic premise with slight variations.

In this example, our message needs to get out to three different groups in the United States:

    Drivers: Persons over the age of 16
    Draftees: Male persons between the ages of 18 and 25
    Pilots (specifically commercial pilots): Persons between the ages of 23 and 65

The actual robot that does all this work has not yet arrived at our place of business. Instead of calling, mailing or emailing, a message is printed to the console. The message contains a person's name, age, and information specific to the target medium (for example, email address when emailing or phone number when calling).

With a Person class and search criteria defined, you can write a RoboContact class. One possible solution defines a method for each use case

As you can see from the names (callDrivers, emailDraftees, and mailPilots) the methods describe the kind of behavior that is taking place. The search criteria is clearly conveyed and an appropriate call is made to each robo action. However, this design has some negatives aspects:

    The DRY principle is not followed.
        Each method repeats a looping mechanism.
        The selection criteria must be rewritten for each method
    A large number of methods are required to implement each use case.
    The code is inflexible. If the search criteria changed, it would require a number of code changes for an update. Thus, the code is not very maintainable.


