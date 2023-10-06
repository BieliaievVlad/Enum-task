package app;

import java.util.Scanner;


public class Data {

     static Colour getData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("There is three colours on a traffic light: Red, Yellow and Green." +
                "\nWhich colour did you see now?: ");
        return Colour.valueOf(scan.nextLine().trim().toUpperCase());
    }
}
