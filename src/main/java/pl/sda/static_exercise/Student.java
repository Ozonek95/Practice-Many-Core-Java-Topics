package pl.sda.static_exercise;

public class Student extends Employee {

    public Student(double grossSalary, String name) {
        super(grossSalary, name);
    }
    static final double TAX_PERCENTAGE=0.05;

    @Override
    double calculateNetSalary() {
        return getGrossSalary()-(getGrossSalary()*TAX_PERCENTAGE);
    }

    @Override
    public String getEmail() {
       return  "Student e-mail: "+getName()+"@gmail.com";
    }
}
