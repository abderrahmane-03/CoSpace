package org.example.Repository.IMP;

import org.example.Repository.INF.EventRepository;
import org.example.entities.Event;
import org.example.entities.Organizer;
import org.example.singleton.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EventRepositoryIMP implements EventRepository {
    @Override
    public Event findById(String id) {
        String query = "SELECT * FROM events WHERE event_id = ?";
        try (Connection connection = DBConnection.getConnectionOrThrow();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return mapResultSetToEvent(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Event> findAll() {
        List<Event> events = new ArrayList<>();
        String query = "SELECT * FROM events";
        try (Connection connection = DBConnection.getConnectionOrThrow();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                events.add(mapResultSetToEvent(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return events;
    }

    @Override
    public Event save(Event event) {
        String query = "INSERT INTO events (event_id, event_name, event_type, organizer_id, date, location, capacity) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DBConnection.getConnectionOrThrow();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, event.getEventId());
            statement.setString(2, event.getEventName());
            statement.setString(3, event.getEventType());
            statement.setString(4, event.getOrganizerId());
            statement.setString(5, event.getDate());
            statement.setString(6, event.getLocation());
            statement.setInt(7, event.getCapacity());
            statement.executeUpdate();
            return event;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void update(Event event) {
        String query = "UPDATE events SET event_name = ?, event_type = ?, organizer_id = ?, date = ?, location = ?, capacity = ? WHERE event_id = ?";
        try (Connection connection = DBConnection.getConnectionOrThrow();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, event.getEventName());
            statement.setString(2, event.getEventType());
            statement.setString(3, event.getOrganizerId());
            statement.setString(4, event.getDate());
            statement.setString(5, event.getLocation());
            statement.setInt(6, event.getCapacity());
            statement.setString(7, event.getEventId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(String id) {
        String query = "DELETE FROM events WHERE event_id = ?";
        try (Connection connection = DBConnection.getConnectionOrThrow();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // Utility method to map ResultSet to Event object
    private Event mapResultSetToEvent(ResultSet resultSet) throws SQLException {
        return new Event(
                resultSet.getString("event_id"),
                resultSet.getString("event_name"),
                resultSet.getString("event_type"),
                resultSet.getString("organizer_id"),
                resultSet.getString("date"),
                resultSet.getString("location"),
                resultSet.getInt("capacity")
        );
    }
}
