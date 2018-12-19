package pl.sda.calculator;

import java.util.Scanner;

public class SmallestDevider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        smallest(num1,num2);


    }

    static void smallest(int a, int b) {
        int biggest = 0;
        int smallest = 0;

        if (a > b) {
            biggest = a;
            smallest = b;
        } else {biggest = b;
        smallest = a;

        }
        for (int i = biggest; i > 0; i--) {
            if (biggest % i == 0 && smallest % i ==0) {
                System.out.println("Największy wspólny dzielnik to :"+i);
                return;
            }


        }
        System.out.println("Brak wspólnych dzielników");
        return;

    }
}
