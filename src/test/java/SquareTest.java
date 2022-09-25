import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    public void shouldNotCreateSquareWithCapitalLetterFile() {
        assertThrows(
                RuntimeException.class, () -> new Square('A', 2)
        );
    }

    @Test
    public void shouldNotCreateSquareWithWrongRangeFile() {
        assertThrows(
                RuntimeException.class, () -> new Square('i', 3)
        );
    }

    @Test
    public void shouldNotCreateSquareWithRandomCharFile() {
        assertThrows(
                RuntimeException.class, () -> new Square('+', 1)
        );
    }

    @Test
    public void shouldNotCreateSquareWithLineSmallerThanOne() {
        assertThrows(
                RuntimeException.class, () -> new Square('a', 0)
        );
    }

    @Test
    public void shouldNotCreateSquareWithLineBiggerThanEight() {
        assertThrows(
                RuntimeException.class, () -> new Square('a', 9)
        );
    }

    @Test
    public void shouldCorrectlyConvertToCoordinate() {
        assertEquals(
                new Coordinate(0, 0),
                new Square('a', 1).toCoordinate()
        );
        assertEquals(
                new Coordinate(7, 7),
                new Square('h', 8).toCoordinate()
        );
        assertEquals(
                new Coordinate(7, 0),
                new Square('h', 1).toCoordinate()
        );
        assertEquals(
                new Coordinate(0, 7),
                new Square('a', 8).toCoordinate()
        );
        assertEquals(
                new Coordinate(4, 1),
                new Square('e', 2).toCoordinate()
        );
        assertEquals(
                new Coordinate(3, 3),
                new Square('d', 4).toCoordinate()
        );
    }


}