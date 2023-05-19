Adding a person class:

        Our Person class might hold the following fields:

            id (int) - the unique user ID

            firstName (String) - the user’s first name

            lastName (String) - the user’s last name

            email (String) - the user’s email, which will also function as their username

            password (String) - the user’s password

        The class would need getters for all of these fields. It could have setters for all fields except id (since it shouldn’t change).

        The Person class might also have the following references:

            PersonProfile - a class to gather up all of the profile information about the user

            List<Events> eventsAttending - to store events the user wants to attend

            List<Events> eventsOwned - a different list, to store the events the user has created

    Person would have a many-to-many relationship with Event via List<Events> eventsAttending. It would have a one-to-many relationship with Event via List<Events> eventsOwned.







# About this Repository

This repo contains starter code for the in-book examples for LaunchCode's
[Java Web Development](https://education.launchcode.org/java-web-development/index.html)
course. 

## Requirements

The classes in this repo require Java11. Please refer to the book referenced
above for instructions on how to download and use the examples.

To update this Project's SDK to use Java11 on your computer: 

- Go to *File -> Project Structure*
  ![Project Structure](./FileProjectStructure.png)
- Under *Project Settings*, select *Project*
- Under *Project SDK*, select your downloaded Java 11 JDK.
    - Note: You may also download the JDK directly from your menu options here.
      
  ![Project Settings](./ProjectSettingsSDK.png)
    
- Next, under *Platform Settings*, select *SDKs* and again select Java11.
  ![Platform Settings](./PlatformSettingsSDKs.png)
- Once selected, hit *Apply* and *Ok*
    

## Updating

Occasionally, the LaunchCode team will make changes to this repository
that will affect your coursework. When you start your prep-work for each
lesson of the course, be sure to fetch to stay up to date with the 
latest changes. 
