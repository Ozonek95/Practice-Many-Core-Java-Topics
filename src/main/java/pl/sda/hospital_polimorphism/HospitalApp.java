package pl.sda.hospital_polimorphism;

public class HospitalApp {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        Person doctor = new Doctor("Piotruś Pławecki",5000,1000);
        Person nurse1 = new Nurse("Halyna Szpak",3000,10);
        Person nurse2 = new Nurse("Agatka Nowak",2500,5);
        Hospital.add(doctor);
        Hospital.add(nurse1);
        Hospital.add(nurse2);
        Hospital.add(new Doctor("Arek",2000,400));

        System.out.println(hospital);


    }
}
