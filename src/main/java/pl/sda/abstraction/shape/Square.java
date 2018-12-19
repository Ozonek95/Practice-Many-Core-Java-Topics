package pl.sda.abstraction.shape;

public class Square implements Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }


    @Override
    public double area() {
        return a*a;
    }




}
