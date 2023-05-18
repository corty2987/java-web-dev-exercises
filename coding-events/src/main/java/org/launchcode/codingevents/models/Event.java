package org.launchcode.codingevents.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity //persistent class is a synonym for entity
public class Event extends AbstractEntity {


    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    @NotBlank(message = "Name is required")
    private String name;

    @OneToOne(cascade = CascadeType.ALL) //cascade every operation on an event object down into the details the sub object
    @Valid //need this because when we want to validate our new event object in our controller (handler method/form submission/model binding) when we add valid to the event it will validate the top level fields ex. name and category
    @NotNull
    private EventDetails eventDetails;

    @ManyToOne //one eventCategory to many events
    @NotNull(message = "Category is required")
    private EventCategory eventCategory; //don't need validation bc enums are restricted to the values you assign them

    //when adding another private field, you must add another input element to the create event form with a name=numberOfAttendees attribute


    public Event(String name, EventCategory eventCategory) {
        this.name = name;
        this.eventCategory = eventCategory;

    }

    public Event() {
    } //no arg constructor

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }
}


