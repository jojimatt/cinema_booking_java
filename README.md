A Java + PostgreSQL application for customers to book movies.

Features
* List shows and show times
* List current movies running in theatre
* Book tickets
* Track available and booked seats
* JDBC-based persistence with PostgreSQL

Tech Stack
* Java 17+
* PostgreSQL 16+
* Maven (dependency management)
* JDBC (database integration)

Structure  
cinema-booking-app/  
&nbsp;│── src/  # Java source code  
&nbsp;&nbsp; │── entity  Data access objects  
&nbsp;&nbsp; │── services database connection, movie listing, show listing, booking management  
&nbsp;│── pom.xml             # Maven dependencies  
&nbsp;│── schema.sql          # Database schema  
&nbsp;│── data.sql            # Sample data  
&nbsp;│── config.properties   # Database connection settings  
&nbsp;│── README.md           # Project documentation  


Database Setup
1) Create username, password for database access and create database. Run the following in sql bash after installing postgresql  
    &nbsp;CREATE USER cinema_user WITH PASSWORD 'cinema_pass';  
    &nbsp;CREATE DATABASE cinema_booking OWNER cinema_user;  
    &nbsp;GRANT ALL PRIVILEGES ON DATABASE cinema_booking TO cinema_user;  

2) Create tables in the database & insert sample data. Run the following to create tables from schema.sql and sample data from data.sql  
   &nbsp;psql -U cinema_user -d cinema_booking -f schema.sql  
  &nbsp;psql -U cinema_user -d cinema_booking -f data.sql  
 
