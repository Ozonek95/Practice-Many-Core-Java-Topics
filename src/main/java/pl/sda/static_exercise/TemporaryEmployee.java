package pl.sda.static_exercise;

public class TemporaryEmployee extends Employee
{
    public TemporaryEmployee(double grossSalary, String name) {
        super(grossSalary, name);
    }

    static final double TAX_PERCENTAGE = 0.10;

    @Override
    double calculateNetSalary() {
        return getGrossSalary()-(getGrossSalary()*TAX_PERCENTAGE);
    }

    @Override
    public String getEmail() {
        return "TemporaryEmployer e-mail:"+getName()+"@gmail.com";
    }
}
