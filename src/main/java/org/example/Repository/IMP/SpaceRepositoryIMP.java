package org.example.Repository.IMP;


import org.example.Repository.INF.SpaceRepository;
import org.example.entities.Space;

import java.util.List;

public class SpaceRepositoryIMP implements SpaceRepository {


    @Override
    public Space findById(String s) {
        return null;
    }

    @Override
    public List findAll() {
        return List.of();
    }

    @Override
    public void save(Space entity) {

    }

    @Override
    public void update(Space entity) {

    }

    @Override
    public void deleteById(String s) {

    }


}
