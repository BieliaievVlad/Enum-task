package app;

public enum Colour {

    RED("Stop."),
    YELLOW("Pay attention."),
    GREEN("Now you can move.");

    private final String colour;

    Colour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }
}
