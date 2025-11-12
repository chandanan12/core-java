package com.xworkz.objectclass.internal;

public class Movie {
    public String title;
    public String director;
    public double rating;
    public int duration;
    public boolean isReleased;

    public Movie() {
        System.out.println("Movie info added");
    }

    public Movie(String title, String director, double rating, int duration, boolean isReleased) {
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.duration = duration;
        this.isReleased = isReleased;
    }

    public String toString() {
        return "Movie{title=" + title + ", director=" + director + ", rating=" + rating +
                ", duration=" + duration + ", isReleased=" + isReleased + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Movie)) return false;
        Movie m = (Movie) obj;
        return title.equals(m.title) && director.equals(m.director) &&
                rating == m.rating && duration == m.duration && isReleased == m.isReleased;
    }
}