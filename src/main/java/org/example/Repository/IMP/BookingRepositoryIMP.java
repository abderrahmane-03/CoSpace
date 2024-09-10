package org.example.Repository.IMP;

import org.example.Repository.INF.BookingRepository;
import org.example.entities.Booking;

import java.util.List;

public class BookingRepositoryIMP implements BookingRepository {
    @Override
    public Booking findById(String s) {
        return null;
    }

    @Override
    public List<Booking> findAll() {
        return List.of();
    }

    @Override
    public void save(Booking entity) {

    }

    @Override
    public void update(Booking entity) {

    }

    @Override
    public void deleteById(String s) {

    }
}
