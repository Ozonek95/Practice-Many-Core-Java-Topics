package pl.sda.abstraction.calculator;

public class Substract extends AbstractOperations implements Operations {



    private int a;
    private int b;

    public Substract(int a, int b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        return a-b;
    }
}
