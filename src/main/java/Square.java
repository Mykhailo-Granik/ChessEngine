import lombok.AllArgsConstructor;

public class Square {

    private char file;
    private int line;

    public Square(char file, int line) {
        if ((file < 'a') || (file > 'h')) {
            throw new RuntimeException("Invalid file " + file);
        }
        if ((line < 1) || (line > 8)) {
            throw new RuntimeException("Invalid line " + line);
        }
        this.file = file;
        this.line = line;
    }

    public Coordinate toCoordinate() {
        return new Coordinate(
                file - 'a',
                line - 1
        );
    }

}
