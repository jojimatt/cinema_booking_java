package com.cinema.bookingjava.entity;

import java.util.List;

public class Movie {
    private long movie_id;
    String title;
    String genre;
    String runtime;
    String director;
    List<String> actors;
    String language;
   public Movie(long movie_id, String title, String genre, String runtime, String director, List<String> actors, String language) {
       this.movie_id = movie_id;
        this.title = title;
        this.genre = genre;
        this.runtime = runtime;
        this.director = director;
        this.actors = actors;
        this.language = language;
   }
   public long getMovie_id() {
        return movie_id;
    }

}
