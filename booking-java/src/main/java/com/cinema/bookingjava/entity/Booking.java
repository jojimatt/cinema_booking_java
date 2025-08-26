package com.cinema.bookingjava.entity;

public class Booking {
    private String user;
    private Movie movie;
    private Seat seat;

    public Booking(String user, Movie movie, Seat seat) {
        this.user = user;
        this.movie = movie;
        this.seat = seat;
    }
}
