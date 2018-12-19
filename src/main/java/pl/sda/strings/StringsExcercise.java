package pl.sda.strings;

import java.util.Scanner;

public class StringsExcercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Show how many words You want input :");
        int wordsChoice = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[wordsChoice];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Input " + (i + 1) + " word");
            strings[i] = scanner.nextLine();
        }

        System.out.println(excerciseResult(strings));


    }

    public static String excerciseResult(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i].charAt(strings[i].length() - 1));
        }
        return sb.toString();


    }
}
