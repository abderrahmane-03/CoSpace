package org.example.entities;

public class Feedback {
    private String feedbackId;
    private String memberId;
    private String eventId;
    private String feedbackText;
    private int rating; // Rating out of 5, for example

    public Feedback(String feedbackId, String memberId, String eventId, String feedbackText, int rating) {
        this.feedbackId = feedbackId;
        this.memberId = memberId;
        this.eventId = eventId;
        this.feedbackText = feedbackText;
        this.rating = rating;
    }

    // Getters and Setters
    public String getFeedbackId() { return feedbackId; }
    public void setFeedbackId(String feedbackId) { this.feedbackId = feedbackId; }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getEventId() { return eventId; }
    public void setEventId(String eventId) { this.eventId = eventId; }

    public String getFeedbackText() { return feedbackText; }
    public void setFeedbackText(String feedbackText) { this.feedbackText = feedbackText; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
}

