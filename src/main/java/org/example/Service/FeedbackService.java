package org.example.Service;

import org.example.Repository.INF.FeedbackRepository;
import org.example.entities.Feedback;

import java.util.List;

public class FeedbackService {

    private final FeedbackRepository feedbackRepository;

    // Constructor injection for the repository
    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    // Method to create a new feedback
    public void createFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }

    // Method to get feedback by ID
    public Feedback getFeedbackById(String id) {
        return feedbackRepository.findById(id);
    }

    // Method to get all feedback
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    // Method to update feedback
    public void updateFeedback(Feedback feedback) {
        feedbackRepository.update(feedback);
    }

    // Method to delete feedback by ID
    public void deleteFeedbackById(String id) {
        feedbackRepository.deleteById(id);
    }
}
