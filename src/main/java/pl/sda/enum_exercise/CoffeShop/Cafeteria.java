package pl.sda.enum_exercise.CoffeShop;

import java.util.Arrays;
import java.util.Scanner;

public class Cafeteria {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Coffee.values()));
        System.out.println("Choose Your coffe !");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println("You have picked "+Coffee.valueOf(choice).name());
    }
}
