package ru.alfabank.HomeWork_15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameRentalTest {

    private GameRental rental;

    @BeforeEach
    void setUp() {
        rental = new GameRental();
        rental.addGame(new BoardGame("Catan", 10, 500));
        rental.addGame(new BoardGame("Dixit", 6, 300));
    }

    @Test
    void rentGame_shouldReturnTrueWhenAllowed() {
        boolean result = rental.rentGame("Catan", 12);

        assertTrue(result, "Аренда должна быть успешной для подходящего возраста");
        assertTrue(rental.findGame("Catan").isRented(), "Игра должна стать арендованной");
    }

    @Test
    void rentGame_shouldReturnFalseWhenAgeIsTooLow() {
        boolean result = rental.rentGame("Catan", 9);

        assertFalse(result, "Аренда должна быть запрещена при недостаточном возрасте");
        assertFalse(rental.findGame("Catan").isRented(), "Игра не должна стать арендованной");
    }

    @Test
    void rentGame_shouldReturnFalseWhenAlreadyRented() {
        rental.rentGame("Catan", 12);

        boolean secondAttempt = rental.rentGame("Catan", 12);

        assertFalse(secondAttempt, "Повторная аренда уже арендованной игры должна вернуть false");
    }

    @Test
    void rentGame_shouldThrowWhenGameDoesNotExist() {
        assertThrows(IllegalArgumentException.class,
                () -> rental.rentGame("Unknown", 20),
                "Если игры не существует, должно быть выброшено IllegalArgumentException");
    }

    @Test
    void returnGame_shouldReturnTrueWhenGameWasRented() {
        rental.rentGame("Catan", 12);

        boolean result = rental.returnGame("Catan");

        assertTrue(result, "Возврат арендованной игры должен вернуть true");
        assertFalse(rental.findGame("Catan").isRented(), "Игра должна стать доступной");
    }

    @Test
    void returnGame_shouldReturnFalseWhenGameWasNotRented() {
        boolean result = rental.returnGame("Catan");

        assertFalse(result, "Возврат неарендованной игры должен вернуть false");
    }

    @Test
    void returnGame_shouldReturnFalseWhenGameDoesNotExist() {
        assertFalse(rental.returnGame("Unknown"), "Если игры нет, returnGame должен вернуть false");
    }
}
