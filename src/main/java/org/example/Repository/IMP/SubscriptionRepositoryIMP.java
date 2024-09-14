package org.example.Repository.IMP;

import org.example.Repository.INF.SubscriptionRepository;
import org.example.entities.Subscription;

import java.util.List;

public class SubscriptionRepositoryIMP implements SubscriptionRepository {
    @Override
    public Subscription findById(String s) {
        return null;
    }

    @Override
    public List findAll() {
        return List.of();
    }

    @Override
    public Subscription save(Subscription subscription) {
        return subscription;
    }

    @Override
    public void update(Subscription entity) {

    }

    @Override
    public void deleteById(String s) {

    }
}


