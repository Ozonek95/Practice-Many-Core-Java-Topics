package pl.sda.cartuning;

public class ExtraTuning extends BasicTuning {
    @Override
    void increaseEnginePower(Car car) {
        super.increaseEnginePower(car);
        car.setEnginePower(car.getEnginePower()*1.2);
    }

    @Override
    void increaseTorquel(Car car) {
        super.increaseTorquel(car);
        car.setTorque(car.getTorque()*1.2);
    }

    @Override
    void decreseWeight(Car car) {
        super.decreseWeight(car);
        car.setWeight(car.getWeight()*0.9);
    }
}
