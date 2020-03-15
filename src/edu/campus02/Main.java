package edu.campus02;

public class Main {

    public static void main(String[] args) {

        double zahl1;
        double zahl2;
        String operation;
        double ausgabe = taschenrechner(2.4,3.6, "mal");
        System.out.println(" Ergebnis " + ausgabe);

	// write your code here
    }
    public static double taschenrechner (double zahl1, double zahl2 , String operation) {


        switch (operation) {
            case "plus":
                return zahl1 + zahl2;
            case "minus":
                return zahl1 - zahl2;
            case "mal":
                return  zahl1 * zahl2;
            case "durch":
                return  zahl1 / zahl2;
            default:
                return 0;
        }
    }
}
