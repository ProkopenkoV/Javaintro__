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
        return  "It's LADA KALINA which consists of the following characteristics: "+"Price= $ " + this.getPrice() + "  Fuel consumption= " + this.getFuelConsumption() + " liters Max speed= " + this.getMaxSpeed()+"km/h Number of airbag= "+this.getNumberOfAirbag()
        +"  Number of old seats=" + this.getNumberOfOldSeats()+
               "\n   This car belongs to the B-class segment ";
    }

    @Override
    public int getPrice(int price) {
        return 0;
    }
}

