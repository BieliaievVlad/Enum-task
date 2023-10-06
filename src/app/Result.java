package app;

public class Result {

     static String getResult(Colour colour) {
        return switch (colour) {
            case RED, YELLOW, GREEN -> colour.getColour();
        };
    }
}
