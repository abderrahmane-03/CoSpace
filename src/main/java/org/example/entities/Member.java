package org.example.entities;

public class Member extends User {
    private String membershipId;
    private String phoneNumber;

    public Member(String userId, String name, String email, String password, String role, String membershipId, String phoneNumber) {
        super(userId, name, email, password, role);
        this.membershipId = membershipId;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getMembershipId() { return membershipId; }
    public void setMembershipId(String membershipId) { this.membershipId = membershipId; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
