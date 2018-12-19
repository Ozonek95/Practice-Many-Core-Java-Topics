package pl.sda.lambda_and_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Excercise2 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\adria\\IdeaProjects\\myproject\\src\\main\\resources\\random_text.txt"))) {
            String nextLine=null;
            List<String> listOfWords = new LinkedList<>();
            while ((nextLine=bufferedReader.readLine())!=null){
                String[] split = nextLine.split(" ");
                listOfWords.addAll(Arrays.asList(split));
            }
            System.out.println(Arrays.asList(listOfWords));




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
