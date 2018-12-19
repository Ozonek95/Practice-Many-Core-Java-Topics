package pl.sda.enum_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ColorDemo {
    Color color;

    public ColorDemo(Color color) {

        this.color = color;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your colour, we have "+Arrays.toString(Color.values()));
        String choice = sc.nextLine();
        ColorDemo colorDemo = new ColorDemo(Color.valueOf(choice));
        System.out.println("You've picked "+colorDemo.color+"witch is"+colorDemo.color.getNiceOrNot()+" colour");

    }
}
