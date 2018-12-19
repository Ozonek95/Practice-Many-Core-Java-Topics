package pl.sda.polimorphism;

public class Driver extends Employer{
    private String car;
    private String favouriteRoad;

    @Override
    void introduce() {
        super.introduce();
        System.out.print(" I drive "+getCar());
    }

    public Driver(String job, int experience, String car, String favouriteRoad) {
        super(job, experience);
        this.car = car;
        this.favouriteRoad = favouriteRoad;
    }

    public String getCar() {
        return car;
    }

    public String getFavouriteRoad() {
        return favouriteRoad;
    }
}
