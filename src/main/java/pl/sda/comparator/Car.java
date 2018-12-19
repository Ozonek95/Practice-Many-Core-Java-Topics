package pl.sda.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Car implements Comparable<Car> {

    public static void main(String[] args) {
        Car car1 = new Car(4, "Renault", "aModel");
        Car car2 = new Car(4, "Renault", "bModel");
        Car car3 = new Car(2, "Renault", "bModel");
        Car car4 = new Car(2, "Fiat", "Punto");

        List<Car> carList = new LinkedList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }
        carList.sort(Car::compareTo);
        System.out.println();
        System.out.println("SORTED :");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }

    }

    private int numberOfDors;
    private String mark;
    private String model;

    public Car(int numberOfDors, String mark, String model) {
        this.numberOfDors = numberOfDors;
        this.mark = mark;
        this.model = model;
    }

    public int getNumberOfDors() {
        return numberOfDors;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }


    @Override
    public int compareTo(Car o) {

        int ifTheSameMark = this.getMark().compareTo(o.getMark());
        if (ifTheSameMark != 0) {
            return ifTheSameMark;
        }
        int ifTheSameModel = this.getModel().compareTo(o.getModel());
        if (ifTheSameModel != 0) {
            return ifTheSameModel;
        }
        return this.getNumberOfDors() - o.getNumberOfDors();

    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDors=" + numberOfDors +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
