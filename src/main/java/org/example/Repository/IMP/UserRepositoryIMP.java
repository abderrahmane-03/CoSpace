package org.example.Repository.IMP;

import org.example.Repository.INF.UserRepository;
import org.example.entities.Member;
import org.example.entities.Organizer;
import org.example.entities.User;
import org.example.enums.Role;
import org.example.singleton.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static org.example.enums.Role.MEMBER;
import static org.example.enums.Role.ORGANIZER;

public class UserRepositoryIMP implements UserRepository {
    @Override
    public User findById(String s) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User save(User user) {
//        String query = "INSERT INTO \"User\" ( firstname, lastname, email, address, password_hash) VALUES ( ?, ?, ?, ?, ?)";
//        try (Connection connection = DBConnection.getConnectionOrThrow();
//             PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setString(2, user.getFirstname());  // First name
//            statement.setString(3, user.getLastname());   // Last name
//            statement.setString(4, user.getEmail());      // Email
//            statement.setString(5, user.getAddress());    // Address
//            statement.setString(6, user.getHashedPassword()); // Password Hash
//            statement.executeUpdate();
//            return user;
//        } catch (SQLException e) {
//            e.printStackTrace();
           return null;
//        }

 }
    @Override
    public User findByUsername(String lastname) {
        String query = "SELECT * FROM member WHERE last_name = ?";
        try (Connection connection = DBConnection.getConnectionOrThrow();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, lastname);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // Fetch common fields from the User table
                int userId = resultSet.getInt("user_id");
                String firstname = resultSet.getString("first_name");
                String username = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String rawPassword = resultSet.getString("password_hash");
                String profilePicture = resultSet.getString("profilepicture");

                // Check if the user is a Member
                LocalDate membershipStart = resultSet.getObject("membership_start", LocalDate.class);
                if (membershipStart != null) {
                    // The user is a Member
                    int membershipId = resultSet.getInt("member_id");
                    LocalDate membershipEnd = resultSet.getObject("membership_end", LocalDate.class);
                    String favoriteSpace = resultSet.getString("favorite_space");

                    // Update the constructor to match the correct number of arguments
                    return new Member(
                            userId,
                            firstname,
                            username,
                            email,
                            address,
                            rawPassword,      // Password from the database
                            true,             // Indicate the password is already hashed
                            Role.MEMBER,
                            membershipId,
                            membershipStart,
                            membershipEnd,
                            favoriteSpace,
                            profilePicture
                    );
                }

                // Check if the user is an Organizer (assuming you will implement this)
                String companyName = resultSet.getString("company_name");
                if (companyName != null) {
//                    return new Organizer(
//                        userId,
//                        firstname,
//                        username,
//                        email,
//                        address,
//                        rawPassword,
//                        true,             // Indicate the password is already hashed
//                        Role.ORGANIZER,
//                        companyName
//                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;  // Return null if no user is found
    }





    @Override
    public void update(User entity) {

    }

    @Override
    public void deleteById(String s) {

    }
}
