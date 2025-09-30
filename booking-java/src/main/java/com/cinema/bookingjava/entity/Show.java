package com.cinema.bookingjava.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Show {
    private int show_id;
    private Movie movie;
    private Screen screen;
    private LocalDateTime show_time;
    private int available_seats;
    private int booked_seats;
}
