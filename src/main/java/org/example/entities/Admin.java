package org.example.entities;

public class Admin extends User {
    private String adminLevel;

    public Admin(String userId, String name, String email, String password, String role, String adminLevel) {
        super(userId, name, email, password, role);
        this.adminLevel = adminLevel;
    }

    // Getters and Setters
    public String getAdminLevel() { return adminLevel; }
    public void setAdminLevel(String adminLevel) { this.adminLevel = adminLevel; }
}
