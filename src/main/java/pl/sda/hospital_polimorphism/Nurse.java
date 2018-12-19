package pl.sda.hospital_polimorphism;

public class Nurse extends Person {
    private int overtime;

    @Override
    public String toString() {
        return super.toString() +
                "overtime=" + overtime+"}";
    }

    public Nurse(String name, int salary, int overtime) {
        super(name, salary);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    @Override
    void show() {
        System.out.println("I am " + getName());
    }
}
