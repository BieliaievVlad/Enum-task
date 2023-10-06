package app;



public class Main {

    public static void main(String[] args) {

        try {
            Output.getOutput(Result.getResult(Data.getData()));
        } catch (Exception exc) {
            Output.getOutput("There is no such colour on a traffic light.");
        }
    }
}

