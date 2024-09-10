package org.example;

import org.example.Repository.IMP.EventRepositoryIMP;
import org.example.Repository.INF.EventRepository;
import org.example.Service.EventService;
import org.example.entities.Event;
import org.example.singleton.DBConnection;

import java.sql.Connection;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {


        EventRepository eventRepository = new EventRepositoryIMP();
        EventService eventService = new EventService(eventRepository);

        Event event = new Event("1", "Conference", "Business", "Org1", "2024-12-01", "Location A", 100);
        eventService.createEvent(event);

        Event retrievedEvent = eventService.getEventById("1");
        System.out.println("Event: " + retrievedEvent.getEventName());
    }
}
