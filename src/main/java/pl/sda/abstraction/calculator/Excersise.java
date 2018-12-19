package pl.sda.abstraction.calculator;

public class Excersise {
    public static void main(String[] args) {

        System.out.println(isPalindrome("mammam"));


    }

    static int power (int n){
        if(n==0) {return 1;}

       else {
            return power(n-1)*n;

        }

   }

   static int minInArray(int[] array){
        int min = array[0];
        for (int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }

        }

       return min;
   }
   public static int sumNumbers(int a, int b){
        int sum=0;
        for (int i=a;i<=b;i++){
            sum+=i;
        }
        return sum;

   }
   public static String reverse(String word){
        String newWord="";
        for (int i=word.length()-1;i!=-1;i--){
            newWord += word.charAt(i);
        }
        return newWord;

   }
   public static boolean isPalindrome(String word){
        int firstChar=0;
        int lastChar=word.length()-1;
        while (firstChar<=lastChar){

            if(word.charAt(firstChar)!=word.charAt(lastChar)){
                return false;
            }
            firstChar++;
            lastChar--;
        }
        return true;

   }
}
