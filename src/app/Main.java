package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            getOutput(getResult(getData()));
        } catch (Exception exc) {
            getOutput("There is no such colour on a traffic light.");
        }
    }

    private static Colour getData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("There is three colours on a traffic light: Red, Yellow and Green." +
                "\nWhich colour did you see now?: ");
        return Colour.valueOf(scan.nextLine().trim().toUpperCase());
    }

    private static String getResult(Colour colour) {
        return switch (colour) {
            case RED, YELLOW, GREEN -> colour.getColour();
        };
    }

    private static void getOutput(String out) {
        System.out.println(out);
    }
}

