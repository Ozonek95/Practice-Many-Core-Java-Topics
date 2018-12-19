package pl.sda.lists;

public class Lists {
    public static void main(String[] args) {
        System.out.println(calculate(1,2,3,4,5,6,7,8));

    }
   static public int calculate(int a, int... args){
        int sum = 0;
        for (int i=0;i<args.length;i++){
            sum+=args[i];
        }
        return sum;

    }
}
