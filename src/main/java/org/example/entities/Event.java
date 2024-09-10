package org.example.entities;

public class Event {
    private String eventId;
    private String eventName;
    private String eventType; // You can replace this with an Enum
    private String organizerId;
    private String date;
    private String location;
    private int capacity;

    public Event(String eventId, String eventName, String eventType, String organizerId, String date, String location, int capacity) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventType = eventType;
        this.organizerId = organizerId;
        this.date = date;
        this.location = location;
        this.capacity = capacity;
    }

    // Getters and Setters
    public String getEventId() { return eventId; }
    public void setEventId(String eventId) { this.eventId = eventId; }

    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }

    public String getEventType() { return eventType; }
    public void setEventType(String eventType) { this.eventType = eventType; }

    public String getOrganizerId() { return organizerId; }
    public void setOrganizerId(String organizerId) { this.organizerId = organizerId; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}

