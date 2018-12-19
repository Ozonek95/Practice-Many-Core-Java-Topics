package pl.sda.polimorphism;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Student("Physical Education",2);
        Person p2 = new Student("Acountant",3);
        Person p3 = new MathStudent("Math ofc",3,"Algebra","Algebra");
        Person p4 = new Enginer("Engineer",5,"Car engineer");
        Person p5 = new ITStudent("Webmaster",5,true,"Java");
        p1.setName("Jacek");
        p2.setName("Arek");
        p3.setName("Alicja");
        p4.setName("Arnold");
        p5.setName("Dzordz");

        Person[] personTabel = {p1,p2,p3,p4,p5};
        for (int i=0;i<personTabel.length;i++){
            personTabel[i].introduce();
            System.out.println();

        }
        ((MathStudent) p3).study();
        System.out.println();
        ((ITStudent) p5).study();
    }
}
