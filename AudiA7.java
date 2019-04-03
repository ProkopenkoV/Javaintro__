package _10;



public class AudiA7 extends E_Class{
    int numberOfGearTransmission; //количество ступеней механической коробки передач

    public AudiA7(int price, int fuelConsumption, int maxSpeed, int numberOfAirbag, int numberOfGearTransmission) {
        super(price, fuelConsumption, maxSpeed, numberOfAirbag);
        this.numberOfGearTransmission = numberOfGearTransmission;
    }

    public int getNumberOfGearTransmission() {
        return numberOfGearTransmission;
    }

    public void setNumberOfGearTransmission(int numberOfGearTransmission) {
        this.numberOfGearTransmission = numberOfGearTransmission;
    }

    @Override
    public String toString() {
        return "   It's AUDI A7 which consists of the following characteristics:  "+"   Price= $ " + this.getPrice() + "  Fuel consumption= " + this.getFuelConsumption() + "liters Max speed= " + this.getMaxSpeed()+"km/h Number of airbag= "+this.getNumberOfAirbag()
                +" Number of gear transmission= " +this.getNumberOfGearTransmission()+ "steps gearbox"+"\n   This car belongs to the E-class segment ";
    }

    @Override
    public int getPrice(int price) {
        return 0;
    }
}

