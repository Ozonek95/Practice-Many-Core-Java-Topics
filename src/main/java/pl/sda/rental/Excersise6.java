package pl.sda.rental;

import java.util.Arrays;
import java.util.Scanner;

public class Excersise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do You want to give?");
        int number = sc.nextInt();
        int[]table = createTable(number);
        giveValuesToTable(sc,table );

        System.out.println(Arrays.toString(table));
        System.out.println(sumTabel(table));

    }

    private static void giveValuesToTable(Scanner sc, int[] tabel) {
        for (int i = 0; i < tabel.length; i++) {
            tabel[i] = sc.nextInt();
        }
    }

    static int[] createTable(int nr) {

        int[] table = new int[nr];
        return table;
    }

    static int sumTabel(int[] tabel){
        int sum=0;
        for (int i=0;i<tabel.length;i++){
            sum+=tabel[i];
        }
        return sum;
    }


}
