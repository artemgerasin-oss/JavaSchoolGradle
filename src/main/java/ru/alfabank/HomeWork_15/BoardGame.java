package ru.alfabank.HomeWork_15;

public class BoardGame {
    private final String name;
    private final int minAge;
    private final int rentalCostPerDay;
    private boolean rented;

    public BoardGame(String name, int minAge, int rentalCostPerDay) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Название игры не может быть null или пустым");
        }
        if (minAge < 0) {
            throw new IllegalArgumentException("Минимальный возраст не может быть меньше нуля");
        }
        if (rentalCostPerDay <= 0) {
            throw new IllegalArgumentException("Стоимость аренды должна быть больше нуля");
        }
        this.name = name;
        this.minAge = minAge;
        this.rentalCostPerDay = rentalCostPerDay;
        this.rented = false;
    }

    public String getName() {
        return name;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getRentalCostPerDay() {
        return rentalCostPerDay;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public boolean canBeRentedBy(int age) {
        return age >= minAge;
    }
}
