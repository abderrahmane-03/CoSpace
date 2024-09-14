package org.example.Service.IMP;

import org.example.Repository.INF.UserRepository;
import org.example.entities.User;

import java.util.List;


public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(String id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.update(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
    // Register new user (Member or Organizer)
    public void registerUser(User user) {
        userRepository.save(user);
    }

    // Authenticate user by username and password
    public User authenticate(String lastname, String password) {
        User user = userRepository.findByUsername(lastname);
        if (user != null && user.checkPassword(password)) {
            System.out.println("Login successful! Welcome, " + user.getLastname());
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
        return user;
    }

    }
