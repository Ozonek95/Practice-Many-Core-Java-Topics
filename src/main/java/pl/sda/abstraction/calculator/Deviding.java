package pl.sda.abstraction.calculator;

public class Deviding extends AbstractOperations implements Operations {


    private int a;
    private int b;

    public Deviding(int a, int b) {
        super(a, b);
    }

    @Override
    public double calculate() {

        return a/b;

    }
}
