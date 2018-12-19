package pl.sda.inputoutput;

import java.io.*;

public class InputOutputExcercise {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\adria\\IdeaProjects\\myproject\\src\\main\\resources\\fileInput.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file2 = new File("C:\\Users\\adria\\IdeaProjects\\myproject\\src\\main\\resources\\file-output.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        StringBuilder sb = new StringBuilder();

        try (

                BufferedWriter bw = new BufferedWriter(new FileWriter(file2));

                BufferedReader br = new BufferedReader(new FileReader(file))) {
            String nextLine = null;
            while ((nextLine = br.readLine()) != null) {
                sb.append(nextLine).append("\r\n");

            }
            String result = sb.toString();
            result=result.replace(' ','*').toUpperCase();
            bw.write(result);




            System.out.println(sb);


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }


    }
}
