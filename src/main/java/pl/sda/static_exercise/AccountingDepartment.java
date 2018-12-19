package pl.sda.static_exercise;

public class AccountingDepartment {

    public static void sendPaychecks(CompanyEmployess company) {
        for (int i = 0; i < company.getAllEmployers().length; i++) {
            if (company.getAllEmployers()[i] != null) {
                System.out.println(company.getAllEmployers()[i].getEmail());

                System.out.println(company.getAllEmployers()[i].calculateNetSalary());

                System.out.println();
            }
        }


    }
}
