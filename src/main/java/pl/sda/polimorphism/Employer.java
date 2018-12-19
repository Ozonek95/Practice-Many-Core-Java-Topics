package pl.sda.polimorphism;

public class Employer extends Person {
    public Employer(String job, int experience) {
        this.job = job;
        this.experience = experience;
    }

    private String job;
    private int experience;
    @Override
    void introduce() {
        System.out.println("I am Employer ! i am "+ getJob());
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
