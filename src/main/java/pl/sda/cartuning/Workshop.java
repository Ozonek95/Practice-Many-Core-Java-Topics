package pl.sda.cartuning;

public class Workshop {
    public static void main(String[] args) {
        Car c1 = new Car(1000,1000,1000);
        Car c2 = new Car(1000,1000,1000);

        ExtraTuning extraTuning = new ExtraTuning();
        BasicTuning basicTuning = new BasicTuning();
        System.out.println("Standard tuning :");
        basicTuning.increaseTorquel(c2);
        basicTuning.decreseWeight(c2);
        basicTuning.increaseEnginePower(c2);
        show(c2);
        System.out.println("Extra tuning :");
        extraTuning.decreseWeight(c1);
        extraTuning.increaseEnginePower(c1);
        extraTuning.increaseTorquel(c1);
        show(c1);




    }

    static void show(Car car){
        System.out.println("Moc silnika :"+ car.getEnginePower());
        System.out.println("Moment obrotowy :"+car.getTorque());
        System.out.println("Waga :"+car.getWeight());
    }
}
