package pl.sda.deposit;

public class BankDeposit {
   private double totalAmount;
    private int duration;
    private double percentage;

    public BankDeposit(){

    }

    public BankDeposit(double totalAmount, int duration, double percentage) {
        this.totalAmount = totalAmount;
        this.duration = duration;
        this.percentage = percentage;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration>0)
        this.duration = duration;
        else { System.out.println("Podałeś liczbę ujemną. Będzie przypał");

        }
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage/100;
    }

    double calculate(double depositAmount, int days, double percentage){


        double earnings = depositAmount * days * percentage/365;
        earnings = earnings*0.81;
        double finalAmonut = totalAmount+earnings;

        return finalAmonut;
    }


}
