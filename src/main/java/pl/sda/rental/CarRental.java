package pl.sda.rental;

public class CarRental {
    public static void main(String[] args) {

        Car car1 = new Car("Fiat",10);
        Car car2 = new Car("Ferrari","awesome", 1,"red");
        Car car3 = new Car("Toyota","Yaris",20,"blue");

        car1.display();
        System.out.println();
        car2.display();
        System.out.println();
        car3.display();

    }
}
