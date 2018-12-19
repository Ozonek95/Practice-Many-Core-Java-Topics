package pl.sda.stack;

import java.util.Arrays;

public class Stack<T> {
    T[] stack;

    public T[] getStack() {
        return stack;
    }

    public Stack(T[] type) {

        this.stack = type;

    }

    public void push(T value) {

        int i = 0;
        while (stack[i]!=null)
        {i++;}

        stack[i]=value;

        if(stack.length==i+1){
           stack = Arrays.copyOf(stack,stack.length*2);
        }

    }

    public T top(){

        int i = stack.length-1;
        while (stack[i]==null){
            i--;
        }
        return stack[i];

    }
    public void pop(){

        int i = stack.length-1;
        while (stack[i]==null){
            i--;
        }
        stack[i]=null;
        if(i<stack.length/2){
            stack = Arrays.copyOf(stack,stack.length/2);
        }

    }
    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null) {
                empty = false;
            }

        }
        return empty;

    }


}
