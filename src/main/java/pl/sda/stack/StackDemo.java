package pl.sda.stack;

import java.util.Arrays;

public class StackDemo {
    public static void main(String[] args) {

        String[] strings =new String[4];

     Stack<String> stack = new Stack<>(strings);


     stack.push("a");
     stack.push("f");
     stack.push("4");
     stack.push("6");


        System.out.println();
        stack.push("g");
        stack.push("g");
        stack.push("g");

        System.out.println(Arrays.toString(stack.getStack()));




    }

}
