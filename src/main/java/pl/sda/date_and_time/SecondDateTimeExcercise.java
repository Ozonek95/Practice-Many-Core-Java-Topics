package pl.sda.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class SecondDateTimeExcercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean on = true;

        while (on) {
            System.out.println("Put date in format :yyyy-mm-dd");
            String date = scanner.nextLine();
            try {
                LocalDate givenTime = LocalDate.parse(date);
                on = false;


                System.out.println("Pick your option");

                MenuOptions[] enumArray = MenuOptions.values();
                for (int i = 1; i <= enumArray.length; i++) {
                    System.out.print(i + ": " + enumArray[i - 1] + " ");
                }
                System.out.println();

                int choose = scanner.nextInt();

                switch (MenuOptions.choseEnum(choose)) {
                    case DAY:
                        System.out.println(givenTime.getYear());
                        break;
                    case YEAR:
                        System.out.println(givenTime.getDayOfYear());
                        break;
                    case MONTH:
                        System.out.println(givenTime.getDayOfMonth());
                        break;
                    case DAY_OF_YEAR:
                        System.out.println(givenTime.getDayOfYear());
                        break;
                    case DAY_OF_MONTH:
                        System.out.println(givenTime.getDayOfMonth());
                        break;
                    case IF_LEAP:
                        System.out.println(givenTime.isLeapYear());
                        break;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Bad date format. Try again");
            }


        }
    }
}
