package pl.sda.polimorphism;

public class MathStudent extends Student {
    String technology;
    String favouriteMathematicField;

    public String getTechnology() {
        return technology;
    }

    public String getFavouriteMathematicField() {
        return favouriteMathematicField;
    }

    public MathStudent(String fieldOfStudy, int yearOfStudy, String technology, String favouriteMathematicField) {
        super(fieldOfStudy, yearOfStudy);
        this.technology = technology;
        this.favouriteMathematicField = favouriteMathematicField;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.print(" im studying "+" "+getTechnology()+" and i like "+getFavouriteMathematicField());
    }
}
