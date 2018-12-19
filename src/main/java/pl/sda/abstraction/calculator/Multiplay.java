package pl.sda.abstraction.calculator;

public class Multiplay extends AbstractOperations implements Operations {


    private int a;
    private int b;

    public Multiplay(int a, int b) {
        super(a, b);
    }

    @Override
    public double calculate() {

        return a*b;
    }
}
