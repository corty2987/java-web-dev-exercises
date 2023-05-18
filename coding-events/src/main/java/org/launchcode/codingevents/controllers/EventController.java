package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventRepository;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;
    // autowired annotation specifies that springboot should auto populate event Repository.
    // findAll, save, findById

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", eventRepository.findAll());
        return "events/index";
    }

    //lives at /events/create
    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        model.addAttribute(new Event());
        model.addAttribute("types", EventType.values());
        return "events/create";
    }
    //the model defines what the validation parameters are
    //the controller is responsible for checking the criteria
    //when newEvent method is called Spring will create the new Event object for us given the values that are in the request
    @PostMapping("create") //method that is called when we create a new form
    public String processCreateEventForm(@ModelAttribute @Valid Event newEvent,
                                         Errors errors, Model model) { //@ModelAttribute for model binding so the incoming data is shoved into a model event object
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Event");
            return "events/create";
        }
            eventRepository.save(newEvent);
            return "redirect:";

    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model){
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", eventRepository.findAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) { //@RequestParam is the way we get data out of the form
        if (eventIds != null) {                                                            //eventIds parameter needs to be the same as the name attribute of the form element
            for (int id : eventIds) {
                eventRepository.deleteById(id);
            }
        }
        return "redirect:"; //redirect goes to the index
    }
}
