package pl.sda.static_exercise;

import java.util.Arrays;

public class Company implements CompanyPerson,CompanyEmployess {

    private static final int MAX_EMPLOYEE_NUMBER = 10;

    private int numberOfCustomers = 0;

    private int numberOfWorkers = 0;

    private Employee[] employees;

    private Customer[] customers;

    public  int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public  int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public Company() {
        employees = new Employee[MAX_EMPLOYEE_NUMBER];
        customers = new Customer[20];
    }

    public void addEmployee(Employee employee) {
        if (numberOfWorkers == MAX_EMPLOYEE_NUMBER) {
            System.out.println("We don't need new workers");
        } else {
            employees[numberOfWorkers] = employee;

        }
        numberOfWorkers++;

    }

    public void removeEmployee(Employee employee) {
        for (int i = 0; i < numberOfWorkers; i++) {
            if (employee.equals(employees[i])) {
                System.arraycopy(employees, i + 1, employees, i, employees.length - i - 1);
                numberOfWorkers--;
            }
        }

    }

    public Employee getEmployee(int index) {

        return employees[index];

    }

    public double earnings() {
        double amount = 0;
        for (int i = 0; i < numberOfWorkers; i++) {
            amount += employees[i].calculateNetSalary();
        }
        return amount;
    }

    public double avargeEarnings() {
        return earnings() / numberOfWorkers;
    }

    public void addCustomer(Customer customer) {
        if (customers.length == numberOfCustomers) {
            customers = Arrays.copyOf(customers, customers.length + 10);
        }
        customers[numberOfCustomers] = customer;
        numberOfCustomers++;
    }
@Override
    public Employee[] getAllEmployers() {
       Employee[] result = new Employee[numberOfWorkers];
       System.arraycopy(employees,0,result,0,numberOfWorkers);
       return result;
    }
@Override
   public Person[] getAllPerson() {
        Person[] people = new Person[numberOfWorkers + numberOfCustomers];
        for (int i = 0; i < numberOfWorkers; i++) {

            people[i] = employees[i];
        }
        int customerIndex = 0;
        for (int i = numberOfWorkers; i < people.length; i++) {
            people[i] = customers[customerIndex];
            customerIndex++;
        }

        return people;
    }


}




