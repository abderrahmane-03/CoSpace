package org.example.Repository.IMP;

import org.example.Repository.INF.AdditionalServiceRepository;
import org.example.entities.AdditionalService;

import java.util.List;

public class AdditionalServiceRepositoryIMP implements AdditionalServiceRepository {
    @Override
    public AdditionalService findById(String s) {
        return null;
    }

    @Override
    public List<AdditionalService> findAll() {
        return List.of();
    }

    @Override
    public AdditionalService save(AdditionalService additionalService) {
        return additionalService;
    }

    @Override
    public void update(AdditionalService entity) {

    }

    @Override
    public void deleteById(String s) {

    }
}
