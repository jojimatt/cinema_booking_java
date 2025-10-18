INSERT INTO shows (screen_id, movie_id, show_time, available_seats,booked_seats)
VALUES (
    1,
    (SELECT movie_id FROM movies WHERE title = 'Inception'),
    '2025-10-09 18:30:00',(SELECT total_seats FROM screens WHERE screen_id = 1) ,0
),
(
    1,
    (SELECT movie_id FROM movies WHERE title = 'Premam'),
    '2025-10-09 09:30:00',(SELECT total_seats FROM screens WHERE screen_id = 1),0
),
(
    2,
    (SELECT movie_id FROM movies WHERE title = '3 Idiots'),
    '2025-10-09 18:30:00',(SELECT total_seats FROM screens WHERE screen_id = 2),0
),
(
    4,
    (SELECT movie_id FROM movies WHERE title = 'F1'),
    '2025-10-09 15:30:00',(SELECT total_seats FROM screens WHERE screen_id = 4),0
),
(
    4,
    (SELECT movie_id FROM movies WHERE title = 'Top Gun: Maverick'),
    '2025-10-09 18:30:00',(SELECT total_seats FROM screens WHERE screen_id = 1),0
),
(
    3,
    (SELECT movie_id FROM movies WHERE title = 'Inception'),
    '2025-10-09 21:30:00',(SELECT total_seats FROM screens WHERE screen_id = 3),0
),
(
    3,
    (SELECT movie_id FROM movies WHERE title = 'Interstellar'),
    '2025-10-09 11:30:00',(SELECT total_seats FROM screens WHERE screen_id = 3),0
)


;

