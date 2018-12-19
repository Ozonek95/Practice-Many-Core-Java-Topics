package pl.sda.polimorphism;

public class Enginer extends Employer {
   private String field;

    public String getField() {
        return field;
    }

    public Enginer(String job, int experience, String field) {
        super(job, experience);
        this.field = field;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.print(" I AM SUPEEER "+getField());
    }
}
