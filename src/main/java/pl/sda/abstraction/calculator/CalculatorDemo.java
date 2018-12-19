package pl.sda.abstraction.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Operations multiplay = new Multiplay(5,5);
        Operations deviding = new Deviding(5,2);
        Operations substract = new Substract(5,10);
        Operations adding = new Adding(5,5);

        Operations operations[] = {multiplay,substract,deviding,adding};
        for(int i=0;i<operations.length;i++){
            System.out.println(operations[i].calculate());
        }
    }
}
