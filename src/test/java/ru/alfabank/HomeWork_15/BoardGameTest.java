package ru.alfabank.HomeWork_15;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardGameTest {

    private BoardGame game;

    @BeforeEach
    void setUp() {
        game = new BoardGame("Catan", 10, 500);
    }

    @Test
    void constructor_shouldCreateGameWithCorrectFields() {
        assertEquals("Catan", game.getName(), "Имя игры должно быть 'Catan'");
        assertEquals(10, game.getMinAge(), "Минимальный возраст должен быть 10");
        assertEquals(500, game.getRentalCostPerDay(), "Стоимость аренды должна быть 500");
        assertFalse(game.isRented(), "Новая игра не должна быть арендована");
    }

    @Test
    void canBeRentedBy_shouldReturnTrueWhenAgeIsEnough() {
        assertTrue(game.canBeRentedBy(10), "Возраст 10 должен подходить для игры Catan");
        assertTrue(game.canBeRentedBy(25), "Возраст 25 должен подходить для игры Catan");
    }

    @Test
    void canBeRentedBy_shouldReturnFalseWhenAgeIsTooLow() {
        assertFalse(game.canBeRentedBy(9), "Возраст 9 не должен подходить для игры Catan");
    }

    @Test
    void constructor_shouldThrowWhenNameIsNull() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> new BoardGame(null, 10, 100),
                "При null имени должен выбрасываться IllegalArgumentException");
        assertNotNull(ex.getMessage(), "Сообщение исключения не должно быть null");
    }

    @Test
    void constructor_shouldThrowWhenNameIsEmpty() {
        assertThrows(IllegalArgumentException.class,
                () -> new BoardGame("", 10, 100),
                "При пустом имени должен выбрасываться IllegalArgumentException");
    }

    @Test
    void constructor_shouldThrowWhenMinAgeIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> new BoardGame("Catan", -1, 100),
                "При отрицательном возрасте должен выбрасываться IllegalArgumentException");
    }

    @Test
    void constructor_shouldThrowWhenCostIsNotPositive() {
        assertThrows(IllegalArgumentException.class,
                () -> new BoardGame("Catan", 10, 0),
                "При стоимости <= 0 должен выбрасываться IllegalArgumentException");
    }
}
