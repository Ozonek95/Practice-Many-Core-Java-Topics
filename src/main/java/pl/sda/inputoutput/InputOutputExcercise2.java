package pl.sda.inputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutputExcercise2 {
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\adria\\IdeaProjects\\myproject\\src\\main\\resources\\file-output.txt"))) {
            for (int i=1;i<=50;i++){
                if(i%3==0&&i%5==0){
                    bufferedWriter.write("FizzBuzz\r\n");
                }
                else if(i%3==0){
                    bufferedWriter.write("Fizz\r\n");
                }
                else if(i%5==0){
                    bufferedWriter.write("Buzz\r\n");
                }
                else {
                    bufferedWriter.write(i+"\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
