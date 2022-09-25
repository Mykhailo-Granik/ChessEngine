import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
// Coordinates are 0-based
public class Coordinate {

    private int column;
    private int line;

}
