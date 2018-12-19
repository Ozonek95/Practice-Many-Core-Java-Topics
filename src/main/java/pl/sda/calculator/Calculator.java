package pl.sda.calculator;

import java.util.Scanner;

public class Calculator {
    private final static String MULTIPLY ="*";
    private final static String DEVIDE ="/";
    private final static String SUM ="+";
    private final static String SUBSTRACT ="-";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        boolean on = true;
        while (on) {
            int nr1 = getNumber(sc, "Podaj pierwszą liczbę do obliczenia");
            choice = getString(sc);


            int nr2 = getNumber(sc, "Podaj liczbę z którą chcesz dokonać działania");
            switch (choice) {

                case MULTIPLY:
                    System.out.println("Wynik to :" + (nr1 * nr2));
                    break;
                case DEVIDE:
                    if (nr2 != 0) {
                        System.out.println("Wynik to :" + (nr1 / nr2));
                    } else {
                        System.out.println("Nie dziel przez zero !");
                    }
                    break;
                case SUM:
                    System.out.println("Wynik to :" + (nr1 + nr2));
                    break;
                case SUBSTRACT:
                    System.out.println("Wynik to :" + (nr1 - nr2));
                    break;
                default:
                    on = false;


            }

        }

    }

    private static String getString(Scanner sc) {
        System.out.println("wybierz działanie, którego chcesz dokonać : / ; * ; + ; - ;");
        return sc.nextLine();
    }

    private static int getNumber(Scanner sc, String s) {
        System.out.println(s);
        int nr1 = sc.nextInt();
        sc.nextLine();
        return nr1;
    }
}
