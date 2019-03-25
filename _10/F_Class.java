package _10;

// Европейский сегмент легковых автомобилей = F = Luxury cars
// Jaguar XJ
public class F_Class extends CarSegments{
    int numberOfDrivingWheels; //количество ведущих колес.

    public F_Class(int price, double fuelConsumption, int maxSpeed, int numberOfAirbag, int numberOfDrivingWheels) {
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
        return "\n          F_Class on average consists of the following characteristics: " +
                "Number of driving wheels=" + numberOfDrivingWheels +" Price= "+price +" Fuel consumption= "+fuelConsumption+ " Max speed= "+maxSpeed
                ;
    }
}
