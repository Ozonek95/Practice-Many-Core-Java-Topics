package pl.sda.abstraction.shape;



public class AreaAggregator {

    public static void main(String[] args) {


        Shape c1 = new Circle(2);
        Shape r1 = new Rectangle(2,2);
        Shape s1 = new Square(2);
        Shape r2 = new Rectangle(2,2);
        Shape[] shapes = {c1,r1,s1,r2};

        System.out.println(aggregate(shapes));

    }

    public static double aggregate(Shape[] shapes) {

        double areaOfFigures = 0;
        for (int i = 0; i < shapes.length; i++) {

            areaOfFigures += shapes[i].area();
        }
        return areaOfFigures;


    }

}


