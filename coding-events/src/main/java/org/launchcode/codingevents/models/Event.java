package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity //persistent class is a synonym for entity
public class Event extends AbstractEntity {


    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    @NotBlank(message = "Name is required")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again")
    private String contactEmail;


    private EventType type; //don't need validation bc enums are restricted to the values you assign them

    //when adding another private field, you must add another input element to the create event form with a name=numberOfAttendees attribute


    public Event(String name, String description, String contactEmail, EventType type) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;

    }

    public Event() {
    } //no R constructor??

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return name;
    }
}


