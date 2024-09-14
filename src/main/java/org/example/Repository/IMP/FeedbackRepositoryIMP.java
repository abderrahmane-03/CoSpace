package org.example.Repository.IMP;

import org.example.Repository.INF.FeedbackRepository;
import org.example.entities.Feedback;
import org.example.singleton.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FeedbackRepositoryIMP implements FeedbackRepository {
    @Override
    public Feedback findById(String id) {
        String query = "SELECT * FROM feedback WHERE feedback_id = ?";
        try (Connection connection = DBConnection.getConnectionOrThrow();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return mapResultSetToFeedback(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Feedback> findAll() {
        List<Feedback> feedbacks = new ArrayList<>();
        String query = "SELECT * FROM feedback";
        try (Connection connection = DBConnection.getConnectionOrThrow();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                feedbacks.add(mapResultSetToFeedback(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return feedbacks;
    }

    @Override
    public Feedback save(Feedback feedback) {
        String query = "INSERT INTO feedback (feedback_id, member_id, event_id, feedback_text, rating) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DBConnection.getConnectionOrThrow();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, feedback.getFeedbackId());
            statement.setString(2, feedback.getMemberId());
            statement.setString(3, feedback.getEventId());
            statement.setString(4, feedback.getFeedbackText());
            statement.setInt(5, feedback.getRating());
            statement.executeUpdate();
            return feedback;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void update(Feedback feedback) {
        String query = "UPDATE feedback SET member_id = ?, event_id = ?, feedback_text = ?, rating = ? WHERE feedback_id = ?";
        try (Connection connection = DBConnection.getConnectionOrThrow();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, feedback.getMemberId());
            statement.setString(2, feedback.getEventId());
            statement.setString(3, feedback.getFeedbackText());
            statement.setInt(4, feedback.getRating());
            statement.setString(5, feedback.getFeedbackId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(String id) {
        String query = "DELETE FROM feedback WHERE feedback_id = ?";
        try (Connection connection = DBConnection.getConnectionOrThrow();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    // Utility method to map ResultSet to Feedback object
    private Feedback mapResultSetToFeedback(ResultSet resultSet) throws SQLException {
        return new Feedback(
                resultSet.getString("feedback_id"),
                resultSet.getString("member_id"),
                resultSet.getString("event_id"),
                resultSet.getString("feedback_text"),
                resultSet.getInt("rating")
        );
    }
}
