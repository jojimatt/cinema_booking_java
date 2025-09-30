CREATE TABLE movies (
    movie_id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    genre VARCHAR(50),
    duration INT,
    language VARCHAR(50),
    rating DECIMAL(2,1)
);

CREATE TABLE screens (
    screen_id SERIAL PRIMARY KEY,
    screen_name VARCHAR(50) NOT NULL,
    total_seats INT NOT NULL
);

CREATE TABLE shows (
    show_id SERIAL PRIMARY KEY,
    movie_id INT REFERENCES movies(movie_id),
    screen_id INT REFERENCES screens(screen_id),
    show_time TIMESTAMP,
    available_seats INT,
    booked_seats INT
);

