package pl.sda.polimorphism;

public class Student extends Person {

    @Override
    void introduce() {
        System.out.print("My name is "+getName()+" and I am Student ");
    }

    public Student(String fieldOfStudy, int yearOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
        this.yearOfStudy = yearOfStudy;
    }

    private String fieldOfStudy;
    private int yearOfStudy;

    void study(){
        System.out.print("Im learning ");
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
