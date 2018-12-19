package pl.sda.inputoutput;

import java.io.*;
import java.util.*;

public class Excercise4 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\adria\\IdeaProjects\\myproject\\src\\main\\resources\\wordListSorted.txt");
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\adria\\IdeaProjects\\myproject\\src\\main\\resources\\wordList.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
        String nextLine=null;
            List<String> sortedWords = new LinkedList<>();

        while ((nextLine=br.readLine())!=null){
            nextLine = nextLine+("\r\n");
            sortedWords.add(nextLine);
            }
            Collections.sort(sortedWords);
            for (String sortedWord : sortedWords) {
                bw.write(sortedWord);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
