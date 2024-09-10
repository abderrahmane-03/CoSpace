package org.example.entities;

public class Organizer extends User {
    private String companyName;

    public Organizer(String userId, String name, String email, String password, String role, String companyName) {
        super(userId, name, email, password, role);
        this.companyName = companyName;
    }

    // Getters and Setters
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
}

