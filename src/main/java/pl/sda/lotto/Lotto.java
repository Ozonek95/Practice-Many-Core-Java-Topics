package pl.sda.lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {
        System.out.println("Podaj 6 liczb z zaskresu 1-49");

        Scanner sc = new Scanner(System.in);

        Random random = new Random();


        int[] lottoTabel = new int[6];

        for (int i = 0; i < lottoTabel.length; i++) {
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= 49 && ifNotExist(lottoTabel, choice)) {
                lottoTabel[i] = choice;

            }
            else{i--;}

        }//choices of user
        int[] lottoRandom = getIntstoRandom(random);

        showRandomNumbers("Wylosowano numery :" + Arrays.toString(lottoRandom));
        compareNumbersAndShowHits(lottoTabel, lottoRandom);
    }

    private static void compareNumbersAndShowHits(int[] lottoTabel, int[] lottoRandom) {
        System.out.print("Numery, które trawiłeś to :");
        for (int i = 0; i < lottoTabel.length; i++) {
            for (int j = 0; j < lottoRandom.length; j++) {
                if (lottoTabel[i] == lottoRandom[j]) {
                    System.out.print(lottoTabel[i] + " ");
                }
            }
        }//Compare numbers and show numbers youve hit correct
    }

    private static void showRandomNumbers(String s) {
        System.out.println(s);
    }

    private static int[] getIntstoRandom(Random random) {
        int[] lottoRandom = new int[6];
        for (int i = 0; i < lottoRandom.length; i++) {

            int nr = random.nextInt((49) + 1);
            if (ifNotExist(lottoRandom, nr)) {
                lottoRandom[i] = nr;
            } else {
                i--;
            }


        }//six random numbers
        return lottoRandom;
    }

    static boolean ifNotExist(int[] tabel, int number) {
        for (int i = 0; i < tabel.length; i++) {
            if (number == tabel[i]) {
                return false;}
        }
        return true;

    }
}
