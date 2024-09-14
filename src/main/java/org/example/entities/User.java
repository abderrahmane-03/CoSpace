package org.example.entities;

import org.example.enums.Role;
import org.mindrot.jbcrypt.BCrypt;

public abstract class User {
    private int userId;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String profilepicture;
    private String hashedPassword;
    private Role role;

    // Constructor with a password flag (to differentiate between hashed/raw password)
    public User(int userId, String firstname, String lastname, String email, String address, String profilepicture, String password, boolean isPasswordHashed, Role role) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.profilepicture = profilepicture;
        // If the password is not hashed, hash it
        this.hashedPassword = isPasswordHashed ? password : hashPassword(password);
        this.role = role;
    }

    // Method to hash the password
    private String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // Method to check if the entered password matches the stored hashed password
    public boolean checkPassword(String plaintextPassword) {
        return BCrypt.checkpw(plaintextPassword, this.hashedPassword);
    }

    // Getters and Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getProfilePicture() { return profilepicture; }
    public void setProfilePicture(String profilepicture) { this.profilepicture = profilepicture; }

    public String getHashedPassword() { return hashedPassword; }
    public void setHashedPassword(String hashedPassword) { this.hashedPassword = hashedPassword; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
}
