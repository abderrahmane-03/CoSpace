package org.example.Service;

import org.example.Repository.INF.SpaceRepository;
import org.example.entities.Space;

import java.util.List;

public class SpaceService {

    private final SpaceRepository spaceRepository;

    // Constructor injection for the repository
    public SpaceService(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }

    // Method to create a new space
    public void createSpace(Space space) {
        spaceRepository.save(space);
    }

    // Method to get space by ID
    public Space getSpaceById(String id) {
        return spaceRepository.findById(id);
    }

    // Method to get all space
    public List<Space> getAllSpace() {
        return spaceRepository.findAll();
    }

    // Method to update space
    public void updateSpace(Space space) {
        spaceRepository.update(space);
    }

    // Method to delete space by ID
    public void deleteSpaceById(String id) {
        spaceRepository.deleteById(id);
    }
}
