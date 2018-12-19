package pl.sda.hospital_polimorphism;

abstract public class Person {
    private String name;
    private int salary;

    @Override
    public String toString() {
        return
                "{Name='" + name + '\'' +
                        ", salary=" + salary + " ";
    }

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    abstract void show();

}
