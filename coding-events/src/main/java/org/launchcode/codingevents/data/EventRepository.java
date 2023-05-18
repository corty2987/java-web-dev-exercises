package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> { //parameterized class. Event object for type of thing we're storing (event objects) and the data type of the primary key of that class
}
