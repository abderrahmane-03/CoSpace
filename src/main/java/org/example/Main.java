package org.example;

import org.example.singleton.DBConnection;

import java.sql.Connection;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Connection> conn = DBConnection.getConnection();

    }
}