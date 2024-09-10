package org.example.Service;

import org.example.Repository.INF.OrganizerRepository;
import org.example.entities.Organizer;

import java.util.List;

public class OrganizerService {

    private final OrganizerRepository organizerRepository;

    // Constructor injection for the repository
    public OrganizerService(OrganizerRepository organizerRepository) {
        this.organizerRepository = organizerRepository;
    }

    // Method to create a new organizer
    public void createOrganizer(Organizer organizer) {
        organizerRepository.save(organizer);
    }

    // Method to get organizer by ID
    public Organizer getOrganizerById(String id) {
        return organizerRepository.findById(id);
    }

    // Method to get all organizer
    public List<Organizer> getAllOrganizer() {
        return organizerRepository.findAll();
    }

    // Method to update organizer
    public void updateOrganizer(Organizer organizer) {
        organizerRepository.update(organizer);
    }

    // Method to delete organizer by ID
    public void deleteOrganizerById(String id) {
        organizerRepository.deleteById(id);
    }
}
