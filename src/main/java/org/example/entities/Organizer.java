package org.example.entities;

import org.example.enums.Role;

public class Organizer extends User {
    private String companyName;

    public Organizer(int userId, String firstname, String lastname, String email, String address, String password, Role role,  boolean isPasswordHashed,String organizationName) {
        // Add "default.png" as a placeholder for profilepicture
        super(userId, firstname, lastname, email, address, "default.png", password,isPasswordHashed, role);
        this.companyName = companyName;
    }

    // Getters and Setters
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
}
