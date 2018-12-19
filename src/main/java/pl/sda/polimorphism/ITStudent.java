package pl.sda.polimorphism;

public class ITStudent extends Student {

    private String technology;
    private boolean haveAGirlfriend;

    public ITStudent(String fieldOfStudy, int yearOfStudy, boolean haveAGirlfriend, String technology) {
        super(fieldOfStudy, yearOfStudy);
       this.haveAGirlfriend = haveAGirlfriend;
       this.technology = technology;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.print(" of "+getTechnology());
        if(isHaveAGirlfriend()){
        System.out.print(" And i have girlfriend");}
        else System.out.println("And i dont have girlfriend");
    }

    @Override
    void study() {
        super.study();
        System.out.print(" "+getTechnology());
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public boolean isHaveAGirlfriend() {
        return haveAGirlfriend;
    }

    public void setHaveAGirlfriend(boolean haveAGirlfriend) {
        this.haveAGirlfriend = haveAGirlfriend;
    }
}
