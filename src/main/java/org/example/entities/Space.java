package org.example.entities;

public class Space {
    private String spaceId;
    private String name;
    private String location;
    private int capacity;

    public Space(String spaceId, String name, String location, int capacity) {
        this.spaceId = spaceId;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    // Getters and Setters
    public String getSpaceId() { return spaceId; }
    public void setSpaceId(String spaceId) { this.spaceId = spaceId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}

