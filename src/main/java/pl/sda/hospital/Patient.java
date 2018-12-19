package pl.sda.hospital;

public class Patient {
    private String name;
    private String surname;
    private String pesel;
    private int age;

    public Patient(String name, String surname, String pesel, int age) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                '}';
    }
}
