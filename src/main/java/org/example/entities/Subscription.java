package org.example.entities;

public class Subscription {
    private String subscriptionId;
    private String memberId;
    private String startDate;
    private String endDate;
    private double amount;

    public Subscription(String subscriptionId, String memberId, String startDate, String endDate, double amount) {
        this.subscriptionId = subscriptionId;
        this.memberId = memberId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
    }

    // Getters and Setters
    public String getSubscriptionId() { return subscriptionId; }
    public void setSubscriptionId(String subscriptionId) { this.subscriptionId = subscriptionId; }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}

