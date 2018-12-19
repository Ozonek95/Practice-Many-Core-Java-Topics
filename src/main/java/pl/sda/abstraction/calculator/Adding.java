package pl.sda.abstraction.calculator;

public class Adding extends AbstractOperations implements Operations{


    private int a;
    private int b;

    public Adding(int a, int b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        return a+b;
    }
}
