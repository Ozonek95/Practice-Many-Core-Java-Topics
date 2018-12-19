package pl.sda.static_exercise;

public abstract class Employee implements Person {
    private double grossSalary;
    private String name;


    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public Employee(double grossSalary, String name) {
        this.grossSalary = grossSalary;
        this.name = name;


    }

    abstract double calculateNetSalary() ;


    @Override
    public String toString() {
        return "Employee name :"+name;
    }
}
