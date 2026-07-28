package ru.alfabank.HomeWork_14_1;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {

        return Double.compare(m1.getRating(), m2.getRating());
    }
}
