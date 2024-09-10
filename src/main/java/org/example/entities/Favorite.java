package org.example.entities;

public class Favorite {
    private String favoriteId;
    private String memberId;
    private String eventId;

    public Favorite(String favoriteId, String memberId, String eventId) {
        this.favoriteId = favoriteId;
        this.memberId = memberId;
        this.eventId = eventId;
    }

    // Getters and Setters
    public String getFavoriteId() { return favoriteId; }
    public void setFavoriteId(String favoriteId) { this.favoriteId = favoriteId; }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getEventId() { return eventId; }
    public void setEventId(String eventId) { this.eventId = eventId; }
}
