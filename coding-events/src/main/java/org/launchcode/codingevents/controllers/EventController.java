package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", EventData.getAll());
        return "events/index";
    }

    //lives at /events/create
    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@ModelAttribute Event newEvent) { //@ModelAttribute for model binding
        EventData.add(newEvent);                        //when newEvent method is called Spring will create the new Event object for us given the values that are in the request
        return "redirect:";

    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model){
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", EventData.getAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) { //@RequestParam is the way we get data out of the form
        if (eventIds != null) {                                                            //eventIds parameter needs to be the same as the name attribute of the form element
            for (int id : eventIds) {
                EventData.remove(id);
            }
        }
        return "redirect:"; //redirect goes to the index
    }
    @GetMapping("edit/{eventId}") //include the path variable eventId so paths like /events/edit/3 will work
    public String displayEditForm(Model model, @PathVariable int eventId){
        //Use an EventData method to find the event object with the given eventId

        Event eventToEdit = EventData.getById(eventId);

        // Put the event object in the model with .addAttribute()
        model.addAttribute("event", EventData.getById(eventId));

        String title = "Edit Event " + eventToEdit.getName() + " (id=" + eventToEdit.getId() + ")";
        model.addAttribute("title", title);

        //Return the appropriate template string
        return "events/edit";
    }
    @PostMapping("edit")
    public String processEditForm(int eventId, String name, String description) {

        Event eventToEdit = EventData.getById(eventId);
        eventToEdit.setName(name);
        eventToEdit.setDescription(description);

        return "redirect:";
    }




}
