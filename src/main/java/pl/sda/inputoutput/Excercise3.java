package pl.sda.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Excercise3 {
    private final static String smallFile = "C:\\Users\\adria\\IdeaProjects\\myproject\\src\\main\\resources\\small_file.txt";
    private final static String bigFile = "C:\\Users\\adria\\IdeaProjects\\myproject\\src\\main\\resources\\big_file.txt";

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(bigFile);
             FileWriter fileWriter = new FileWriter("C:\\Users\\adria\\IdeaProjects\\myproject\\src\\main\\resources\\file-input.txt")) {
            int nextLine = 0;

            Map<Character, Integer> mapOfInts = new TreeMap<>();

            long l2 = System.nanoTime();
            while ((nextLine = fileReader.read()) != -1) {
                char character = (char) nextLine;
               character = Character.toLowerCase(character);

                if (!mapOfInts.containsKey(character)) {
                    mapOfInts.put(character, 1);
                } else {
                    mapOfInts.put(character, mapOfInts.get(character) + 1);
                }

            }
            Set<Map.Entry<Character,Integer>> entries = mapOfInts.entrySet();
            for(Map.Entry<Character,Integer> entry:entries){
                fileWriter.write(entry.getKey()+"-"+entry.getValue()+"\r\n");
                System.out.println(entry.getKey()+"-"+entry.getValue());

            }

            long l = System.nanoTime();

            System.out.println("Tim with getNano :"+(l-l2)/1000);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
