package org.example.Repository.IMP;

import org.example.Repository.INF.MemberRepository;
import org.example.entities.Member;

import java.sql.*;
import java.util.List;
import org.example.singleton.DBConnection;

public class MemberRepositoryIMP implements MemberRepository {


    @Override
    public Member findById(String s) {
        return null;
    }

    @Override
    public List findAll() {
        return List.of();
    }

    @Override
    public Member save(Member member) {
        Connection connection = null;
        try {
            if (member.getEmail() == null || member.getEmail().isEmpty()) {
                throw new IllegalArgumentException("Email cannot be null or empty for a member.");
            }

            connection = DBConnection.getConnectionOrThrow();
            connection.setAutoCommit(false);  // Auto-commit disabled to manage transaction

            // Single query to insert into both the `User` (inherited by `Member`) and `Member` table
            String insertQuery = "INSERT INTO member (first_name, last_name, email, password_hash, address, profilepicture, member_id, membership_start, membership_end, favorite_space) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                // Set values for the inherited User fields
                statement.setString(1, member.getFirstname());
                statement.setString(2, member.getLastname());
                statement.setString(3, member.getEmail());
                statement.setString(4, member.getHashedPassword());  // This is already hashed by the User constructor
                statement.setString(5, member.getAddress());
                statement.setString(6, member.getProfilePicture());  // Make sure `getProfilePicture()` is correct

                // Set values for the Member-specific fields
                statement.setInt(7, member.getMembershipId());
                statement.setDate(8, Date.valueOf(member.getMembershipStart()));
                statement.setDate(9, Date.valueOf(member.getMembershipEnd()));
                statement.setString(10, member.getFavoriteSpace());

                // Execute the insertion
                statement.executeUpdate();
            }

            connection.commit();  // Commit the transaction
            return member;

        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback();  // Rollback in case of an error
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
            System.out.println("Failed to insert member or user.");
            return null;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }




    @Override
    public void update(Member entity) {

    }

    @Override
    public void deleteById(String s) {

    }

}
