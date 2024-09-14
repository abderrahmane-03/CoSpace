package org.example.entities;

import org.example.enums.Role;

import java.time.LocalDate;

public class Member extends User {
    private int membershipId;
    private LocalDate membershipStart;
    private LocalDate membershipEnd;
    private String favoriteSpace;

    public Member(int userId, String firstname, String lastname, String email, String address, String password, boolean isPasswordHashed, Role role, int membershipId, LocalDate membershipStart, LocalDate membershipEnd, String favoriteSpace, String profilepicture) {
        super(userId, firstname, lastname, email, address, profilepicture, password,isPasswordHashed, role);
        this.membershipId = membershipId;
        this.membershipStart = membershipStart;
        this.membershipEnd = membershipEnd;
        this.favoriteSpace = favoriteSpace;
    }

    // Getters and Setters
    public int getMembershipId() { return membershipId; }
    public void setMembershipId(int membershipId) { this.membershipId = membershipId; }

    public LocalDate getMembershipStart() { return membershipStart; }
    public void setMembershipStart(LocalDate membershipStart) { this.membershipStart = membershipStart; }

    public LocalDate getMembershipEnd() { return membershipEnd; }
    public void setMembershipEnd(LocalDate membershipEnd) { this.membershipEnd = membershipEnd; }

    public String getFavoriteSpace() { return favoriteSpace; }
    public void setFavoriteSpace(String favoriteSpace) { this.favoriteSpace = favoriteSpace; }
}
