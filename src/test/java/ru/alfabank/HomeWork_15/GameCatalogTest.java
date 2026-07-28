package ru.alfabank.HomeWork_15;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameCatalogTest {

    private GameRental rental;

    @BeforeEach
    void setUp() {
        rental = new GameRental();
    }

    @Test
    void addGame_shouldAddGameToCatalog() {
        BoardGame game = new BoardGame("Catan", 10, 500);

        rental.addGame(game);

        assertEquals(game, rental.findGame("Catan"), "Добавленная игра должна находиться по названию");
    }

    @Test
    void addGame_shouldThrowWhenGameIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> rental.addGame(null),
                "Передача null в addGame должна приводить к IllegalArgumentException");
    }

    @Test
    void addGame_shouldThrowWhenDuplicateNameExists() {
        rental.addGame(new BoardGame("Catan", 10, 500));

        assertThrows(IllegalArgumentException.class,
                () -> rental.addGame(new BoardGame("Catan", 12, 700)),
                "Нельзя добавлять две игры с одинаковым названием");
    }

    @Test
    void findGame_shouldReturnNullWhenGameNotFound() {
        assertNull(rental.findGame("Unknown"), "Если игра не найдена, должен вернуться null");
    }
}
