package org.example.Repository.IMP;

import org.example.Repository.INF.OrganizerRepository;
import org.example.entities.Organizer;

import java.util.List;

public class OrganizerRepositoryIMP implements OrganizerRepository {

    @Override
    public Organizer findById(String s) {
        return null;
    }

    @Override
    public List findAll() {
        return List.of();
    }

    @Override
    public Organizer save(Organizer organizer) {
        return organizer;
    }

    @Override
    public void update(Organizer entity) {

    }

    @Override
    public void deleteById(String s) {

    }


}
