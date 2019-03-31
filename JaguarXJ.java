package _10;

public class JaguarXJ  extends F_Class{
    int numberOfDrivingWheels; //количество ведущих колес.

    public JaguarXJ(int price, int fuelConsumption, int maxSpeed, int numberOfAirbag, int numberOfDrivingWheels) {
        super(price, fuelConsumption, maxSpeed, numberOfAirbag);
        this.numberOfDrivingWheels = numberOfDrivingWheels;
    }

    public int getNumberOfDrivingWheels() {
        return numberOfDrivingWheels;
    }

    public void setNumberOfDrivingWheels(int numberOfDrivingWheels) {
        this.numberOfDrivingWheels = numberOfDrivingWheels;
    }

    @Override
    public String toString() {
        return "Jaguar XJ consists of the following characteristics: "+"Price= " + this.getPrice() + " Fuel consumption= " + this.getFuelConsumption() + " Max speed= " + this.getMaxSpeed()+" Number of airbag= "+this.getNumberOfAirbag() +
                " Number of driving wheels= " + this.getNumberOfDrivingWheels()+"     It's F-Class";

    }
}
