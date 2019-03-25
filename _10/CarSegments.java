package _10;

public class CarSegments {
    int price;
    double fuelConsumption;
    int maxSpeed;
    int numberOfAirbag;

    public CarSegments(int price, double fuelConsumption, int maxSpeed, int numberOfAirbag) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.numberOfAirbag = numberOfAirbag;
    }

    public int getNumberOfAirbag() {
        return numberOfAirbag;
    }

    public void setNumberOfAirbag(int numberOfAirbag) {
        this.numberOfAirbag = numberOfAirbag;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
