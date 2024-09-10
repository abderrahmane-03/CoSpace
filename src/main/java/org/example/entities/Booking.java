package org.example.entities;

public class Booking {
    private String bookingId;
    private String memberId;
    private String spaceId;
    private String startDate;
    private String endDate;

    public Booking(String bookingId, String memberId, String spaceId, String startDate, String endDate) {
        this.bookingId = bookingId;
        this.memberId = memberId;
        this.spaceId = spaceId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and Setters
    public String getBookingId() { return bookingId; }
    public void setBookingId(String bookingId) { this.bookingId = bookingId; }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getSpaceId() { return spaceId; }
    public void setSpaceId(String spaceId) { this.spaceId = spaceId; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }
}

