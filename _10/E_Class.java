package _10;

// Европейский сегмент легковых автомобилей = E = Executive cars
// Audi A6
public class E_Class extends CarSegments {
    int numberOfGearTransmission; //количество ступеней механической коробки передач

    public E_Class(int price, double fuelConsumption, int maxSpeed, int numberOfAirbag, int numberOfGearTransmission) {
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
        return "\n          E_Class on average consists of the following characteristics: "   +
                "Number of gear transmission=" + numberOfGearTransmission+" Price= "+price +" Fuel consumption= "+fuelConsumption+ " Max speed= "+maxSpeed;
    }
}
