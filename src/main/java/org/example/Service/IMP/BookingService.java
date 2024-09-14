package org.example.Service.IMP;

import org.example.Repository.INF.BookingRepository;
import org.example.entities.Booking;

import java.util.List;

public class BookingService {
    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking getBookingById(String id) {
        return bookingRepository.findById(id);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public void createBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public void updateBooking(Booking booking) {
        bookingRepository.update(booking);
    }

    public void deleteBooking(String id) {
        bookingRepository.deleteById(id);
    }
}
