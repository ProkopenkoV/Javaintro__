package _10;


public class LadaKalina extends B_Class {
    int numberOfOldSeats;

    public LadaKalina(int price, int fuelConsumption, int maxSpeed, int numberOfAirbag, int numberOfOldSeats) {
        super(price, fuelConsumption, maxSpeed, numberOfAirbag);
        this.numberOfOldSeats = numberOfOldSeats;
    }

    public int getNumberOfOldSeats() {
        return numberOfOldSeats;
    }

    public void setNumberOfOldSeats(int numberOfOldSeats) {
        this.numberOfOldSeats = numberOfOldSeats;
    }


    @Override
    public String toString() {
        return  "Lada Kalina consists of the following characteristics: " +
                " Price= " + this.getPrice() + " Fuel consumption= " + this.getFuelConsumption() + " Max speed= " + this.getMaxSpeed()+" Number of airbag= "+this.getNumberOfAirbag()+" Number of old seats=" + this.getNumberOfOldSeats()+
               "      It's B-Class";
    }
}

