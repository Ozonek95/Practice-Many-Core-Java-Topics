package pl.sda.abstraction.shape;


import java.util.ArrayList;

import java.util.List;

public class Stack {
    public static void main(String[] args) {

        ArrayList<Integer> stack = new ArrayList<>(2);

        push(stack, 10);
        push(stack, 20);


        System.out.println(stack.get(0));
        System.out.println(showTop(stack));
        pop(stack);
        pop(stack);
        pop(stack);



    }

    public static void push(List<Integer> list, int o) {
        list.add(list.size(), o);
    }

    public static int showTop(List<Integer> list) {
        return list.get(list.size() - 1);
    }

    public static void pop(List<Integer> list) {
        if(isEmpty(list)==false){
        System.out.println(list.get(list.size()-1));
        list.remove(list.size()-1);}
        else System.out.println("Stack is empty");

    }

    static boolean isEmpty(List list) {
        if (list.size() == 0) {
            return true;
        }
        return false;

    }


}
