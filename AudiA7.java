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
        return "Audi A7 consists of the following characteristics:  "+"Price= " + this.getPrice() + " Fuel consumption= " + this.getFuelConsumption() + " Max speed= " + this.getMaxSpeed()+" Number of airbag= "+this.getNumberOfAirbag()
                +" Number of gear transmission= " +this.getNumberOfGearTransmission()+ "     It's E-Class ";
    }

}

