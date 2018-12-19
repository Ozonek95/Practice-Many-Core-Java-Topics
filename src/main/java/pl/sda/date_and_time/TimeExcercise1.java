package pl.sda.date_and_time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TimeExcercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Push enter to start");
        String enter = scanner.nextLine();
        LocalTime initialTime = LocalTime.now();
        System.out.println("Now push Enter to stop");
        String enter2 = scanner.nextLine();
        LocalTime finalTime = LocalTime.now();
        System.out.println();
        long durationSeconds2 = ChronoUnit.SECONDS.between(initialTime, finalTime);
        System.out.println("DurationSeconds : " + durationSeconds2);


    }
}
