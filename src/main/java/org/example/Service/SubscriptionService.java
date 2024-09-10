package org.example.Service;

import org.example.Repository.INF.SubscriptionRepository;
import org.example.entities.Subscription;

import java.util.List;

public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    // Constructor injection for the repository
    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    // Method to create a new subscription
    public void createSubscription(Subscription subscription) {
        subscriptionRepository.save(subscription);
    }

    // Method to get subscription by ID
    public Subscription getSubscriptionById(String id) {
        return subscriptionRepository.findById(id);
    }

    // Method to get all subscription
    public List<Subscription> getAllSubscription() {
        return subscriptionRepository.findAll();
    }

    // Method to update subscription
    public void updateSubscription(Subscription subscription) {
        subscriptionRepository.update(subscription);
    }

    // Method to delete subscription by ID
    public void deleteSubscriptionById(String id) {
        subscriptionRepository.deleteById(id);
    }
}
