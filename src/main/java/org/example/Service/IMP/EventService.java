package org.example.Service.IMP;


import org.example.Repository.INF.EventRepository;
import org.example.entities.Event;

import java.util.List;

public class EventService {
    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event getEventById(String id) {
        return eventRepository.findById(id);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public void createEvent(Event event) {
        eventRepository.save(event);
    }

    public void updateEvent(Event event) {
        eventRepository.update(event);
    }

    public void deleteEvent(String id) {
        eventRepository.deleteById(id);
    }
}
