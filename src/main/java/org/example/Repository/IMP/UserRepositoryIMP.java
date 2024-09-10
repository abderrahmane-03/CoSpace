package org.example.Repository.IMP;

import org.example.Repository.INF.UserRepository;
import org.example.entities.User;

import java.util.List;

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
    public void save(User entity) {

    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void deleteById(String s) {

    }
}
