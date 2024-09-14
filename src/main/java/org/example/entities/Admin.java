package org.example.entities;

import org.example.enums.Role;

public class Admin extends User {
    private String adminLevel;

    public Admin(int userId, String firstname, String lastname, String email, String address, String password, Role role, boolean isPasswordHashed, String adminLevel) {
        // Add profilepicture, passing a default value such as "default.png"
        super(userId, firstname, lastname, email, address, "default.png", password,isPasswordHashed, role);
        this.adminLevel = adminLevel;
    }

    // Getters and Setters
    public String getAdminLevel() { return adminLevel; }
    public void setAdminLevel(String adminLevel) { this.adminLevel = adminLevel; }
}
