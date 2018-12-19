package pl.sda.bubbleSort;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] table = new int[10];
        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(10);

        }
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(table);
        for (int b:table
             ) {
            System.out.println(b);

        }




    }

    void bubbleSort(int[] table) {


        {
            int it=0;

            while (it<table.length){
                for(int j=1;j<table.length-it;j++)
                {
                    if(table[j-1]>table[j]){
                        swap1(table, j);

                    }

                }
                it++;


            }
        }


    }

    private void swap1(int[] table, int j) {
        int temp = table[j];
        table[j]=table[j-1];
        table[j-1]=temp;
    }





}
