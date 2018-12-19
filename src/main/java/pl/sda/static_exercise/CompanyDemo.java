package pl.sda.static_exercise;

public class CompanyDemo {
    public static void main(String[] args) {
        Company company = new Company();

        Employee employee = new FullTimeEmployee(1225,"Jaco");
        Employee employee1 = new TemporaryEmployee(2000,"Aaaa");

        company.addEmployee(employee);
        company.addEmployee(employee1);



        company.addEmployee(new Student(2000, "Mamaria"));

        company.addEmployee(new Student(2000,"Maciej"));

        company.addCustomer(new Customer("Kasia"));

        company.addCustomer(new Customer("Jacek"));

        company.addCustomer(new Customer("Aroo"));

        AccountingDepartment.sendPaychecks(company);

        EventsDepartment.sendInvitationsToTheParty("Halloveen Party",company);

        System.out.println(company.getNumberOfCustomers());
        System.out.println(company.getNumberOfWorkers());

    }
}
