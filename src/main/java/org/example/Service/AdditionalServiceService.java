package org.example.Service;

import org.example.Repository.INF.AdditionalServiceRepository;
import org.example.entities.AdditionalService;

import java.util.List;

public class AdditionalServiceService {
    private AdditionalServiceRepository AdditionalServiceRepository;

    public AdditionalServiceService(AdditionalServiceRepository AdditionalServiceRepository) {
        this.AdditionalServiceRepository = AdditionalServiceRepository;
    }

    public AdditionalService getAdditionalServiceById(String id) {
        return AdditionalServiceRepository.findById(id);
    }

    public List<AdditionalService> getAllAdditionalServices() {
        return AdditionalServiceRepository.findAll();
    }

    public void createAdditionalService(AdditionalService AdditionalService) {
        AdditionalServiceRepository.save(AdditionalService);
    }

    public void updateAdditionalService(AdditionalService AdditionalService) {
        AdditionalServiceRepository.update(AdditionalService);
    }

    public void deleteAdditionalService(String id) {
        AdditionalServiceRepository.deleteById(id);
    }
}
