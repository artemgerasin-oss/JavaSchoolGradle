package ru.alfabank.HomeWork_15;

import java.util.ArrayList;
import java.util.List;

public class GameRental {
    private final List<BoardGame> catalog = new ArrayList<>();

    public void addGame(BoardGame game) {
        if (game == null) {
            throw new IllegalArgumentException("Игра не может быть null");
        }
        if (findGame(game.getName()) != null) {
            throw new IllegalArgumentException("Нельзя добавить две игры с одинаковым названием");
        }
        catalog.add(game);
    }

    public BoardGame findGame(String name) {
        for (BoardGame game : catalog) {
            if (game.getName().equals(name)) {
                return game;
            }
        }
        return null;
    }

    public boolean rentGame(String name, int customerAge) {
        BoardGame game = findGame(name);
        if (game == null) {
            throw new IllegalArgumentException("Игра не существует");
        }
        if (!game.canBeRentedBy(customerAge)) {
            return false;
        }
        if (game.isRented()) {
            return false;
        }
        game.setRented(true);
        return true;
    }

    public boolean returnGame(String name) {
        BoardGame game = findGame(name);
        if (game == null) {
            return false;
        }
        if (!game.isRented()) {
            return false;
        }
        game.setRented(false);
        return true;
    }

    public int calculateCost(String name, int days) {
        BoardGame game = findGame(name);
        if (game == null) {
            throw new IllegalArgumentException("Игра не существует");
        }
        if (days <= 0) {
            throw new IllegalArgumentException("Количество дней должно быть больше нуля");
        }
        return game.getRentalCostPerDay() * days;
    }

    public void reset() {
        for (BoardGame game : catalog) {
            game.setRented(false);
        }
    }
}
