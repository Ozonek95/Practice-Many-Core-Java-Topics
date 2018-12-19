package pl.sda.abstraction.shape;

public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double area() {
        return a*b;
    }
}
