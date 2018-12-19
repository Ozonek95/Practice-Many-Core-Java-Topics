package pl.sda.cartuning;

public class Car {
    private double enginePower;
    private double torque;
    private double weight;

    public Car(double enginePower, double torque, double weight) {
        this.enginePower = enginePower;
        this.torque = torque;
        this.weight = weight;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
