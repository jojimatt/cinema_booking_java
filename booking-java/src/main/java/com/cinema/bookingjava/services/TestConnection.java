package com.cinema.bookingjava.services;

import java.sql.Connection;

public class TestConnection {
        public static void main(String[] args) {
            try (Connection conn = DatabaseConnection.getConnection()) {
                if (conn != null) {
                    System.out.println("Connected to PostgreSQL successfully!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

