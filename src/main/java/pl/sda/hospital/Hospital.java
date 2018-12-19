package pl.sda.hospital;

import java.util.Scanner;

public class Hospital {

    private int numberOfPatients = 0;
    public Patient[] patients = new Patient[10];

    public Patient[] getPatients() {
        return patients;
    }

    Scanner sc = new Scanner(System.in);

    public void addPatient(Patient patient) {
        if (numberOfPatients == patients.length) {
            System.out.println("SZPITAL PEŁNY");
        } else {
            patients[numberOfPatients] = patient;
            numberOfPatients++;
        }

    }

    public void showTable(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null)
                System.out.println(patients[i]);
        }
    }


}
