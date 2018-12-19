package pl.sda.hospital_polimorphism;

public class Doctor extends Person {
    private int bonus;

    @Override
    public String toString() {
        return super.toString() +
                "bonus=" + bonus +"}";
    }


    public Doctor(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    void show() {
        System.out.println("I am " + getName());
    }
}
