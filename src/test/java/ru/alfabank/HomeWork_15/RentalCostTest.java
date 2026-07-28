package ru.alfabank.HomeWork_15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RentalCostTest {

    private GameRental rental;

    @BeforeEach
    void setUp() {
        rental = new GameRental();
        rental.addGame(new BoardGame("Catan", 10, 500));
        rental.addGame(new BoardGame("Dixit", 6, 300));
    }

    @ParameterizedTest
    @CsvSource({
            "Catan, 1, 500",
            "Catan, 3, 1500",
            "Dixit, 2, 600"
    })
    void calculateCost_shouldReturnCorrectCost(String name, int days, int expected) {
        int actual = rental.calculateCost(name, days);

        assertEquals(expected, actual,
                "Неверный расчёт стоимости аренды для игры " + name + " на " + days + " дней");
    }

    @ParameterizedTest
    @MethodSource("invalidDaysProvider")
    void calculateCost_shouldThrowWhenDaysAreInvalid(String name, int days) {
        assertThrows(IllegalArgumentException.class,
                () -> rental.calculateCost(name, days),
                "Количество дней должно быть больше 0");
    }

    static Stream<org.junit.jupiter.params.provider.Arguments> invalidDaysProvider() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of("Catan", 0),
                org.junit.jupiter.params.provider.Arguments.of("Catan", -1),
                org.junit.jupiter.params.provider.Arguments.of("Dixit", -5)
        );
    }
}
