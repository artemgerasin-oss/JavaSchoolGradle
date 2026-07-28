package ru.alfabank.HomeWork_14_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("InterStellar", 8.7));
        movies.add(new Movie("Shrek", 8.1));
        movies.add(new Movie("Inception", 8.8));
        movies.add(new Movie("Venom", 6.6));

        System.out.println("List films before sort:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // сортировка
        movies.sort(new MovieRatingComparator());

        System.out.println("\nList films after sort:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
