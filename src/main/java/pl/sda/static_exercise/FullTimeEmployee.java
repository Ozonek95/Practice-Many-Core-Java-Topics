package pl.sda.static_exercise;



public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(double grossSalary, String name) {
        super(grossSalary, name);
    }

    static final double TAX_PERCENTAGE = 0.2;
    static final double TAX = 1000;

    @Override
    double calculateNetSalary() {
        double afterTaxValue = getGrossSalary()-TAX;
        return afterTaxValue-(afterTaxValue*TAX_PERCENTAGE);
    }

    @Override
    public String getEmail() {
        return "FullTimeEmployer e-mail:"+getName()+"@gmail.com";
    }
}
