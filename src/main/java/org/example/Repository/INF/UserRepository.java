package org.example.Repository.INF;

import org.example.entities.User;

public interface UserRepository extends Repository<User, String> {
    User findByUsername(String lastname);
}
