package org.example.Repository.IMP;

import org.example.Repository.INF.AdminRepository;
import org.example.entities.Admin;

import java.util.List;

public class AdminRepositoryIMP implements AdminRepository {


    @Override
    public Admin findById(String s) {
        return null;
    }

    @Override
    public List findAll() {
        return List.of();
    }

    @Override
    public Admin save(Admin admin) {
return admin;
    }

    @Override
    public void update(Admin entity) {

    }

    @Override
    public void deleteById(String s) {

    }

}
