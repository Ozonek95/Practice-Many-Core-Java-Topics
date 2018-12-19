package pl.sda.cartuning;

public class BasicTuning {
    void increaseEnginePower(Car car){
        car.setEnginePower(car.getEnginePower() + 20);
        }
        void increaseTorquel(Car car){
        car.setTorque(car.getTorque() + 30);
        }
        void decreseWeight(Car car){
        car.setWeight(car.getWeight() - 15);
        }
}
