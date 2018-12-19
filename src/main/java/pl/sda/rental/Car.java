package pl.sda.rental;

public class Car {
    private String make;
    private String model;
    private int age;
    private String color;

    public Car(String make, int age) {
        this.make = make;
        this.age = age;
    }

    public Car(String make, String model, int age, String color) {
        this(make,age);
        this.age = age;
        this.color = color;
    }



    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println(getAge()+" "+getColor()+" "+ getMake()+" "+getModel());
    }
}
