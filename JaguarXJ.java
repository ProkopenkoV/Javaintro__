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
        return "It's JAGUAR XJ which consists of the following characteristics: "+"Price= " + this.getPrice() + "$ Fuel consumption= " + this.getFuelConsumption() + " liters Max speed= " + this.getMaxSpeed()+"km/h Number of airbag= "+this.getNumberOfAirbag() +
                "airbags Number of driving wheels= " + this.getNumberOfDrivingWheels()+"\nThis car belongs to the F-class segment";

    }

    @Override
    public int getPrice(int price) {
        return 0;
    }
}
