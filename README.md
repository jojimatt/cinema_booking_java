A Java + PostgreSQL application for managing movies, screens, and seat bookings (in progress)

Features
* Manage movies (title, genre, duration, language, rating)
* Manage screens (screen name, seat capacity)
* Schedule shows (movie + screen + time slot)
* Track available and booked seats
* JDBC-based persistence with PostgreSQL

Tech Stack
* Java 17+
* PostgreSQL 16+
* Maven (dependency management)
* JDBC (database integration)

Structure
cinema-booking-app/
│── src/  # Java source code
  │── entity  Data access objects
  │── services database connection, movie listing, show listing, booking management
│── pom.xml             # Maven dependencies
│── schema.sql          # Database schema
│── data.sql            # Sample data
│── config.properties   # Database connection settings
│── README.md           # Project documentation


Database Setup
1) Create username, password for database access and create database. Run the following in sql bash after installing postgresql
    CREATE USER cinema_user WITH PASSWORD 'cinema_pass';
    CREATE DATABASE cinema_booking OWNER cinema_user;
    GRANT ALL PRIVILEGES ON DATABASE cinema_booking TO cinema_user;

2) Create tables in the database & insert sample data. Run the following to create tables from schema.sql and sample data from data.sql
   psql -U cinema_user -d cinema_booking -f schema.sql
  psql -U cinema_user -d cinema_booking -f data.sql

3) 
