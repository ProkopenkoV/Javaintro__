package _10;

// Европейский сегмент легковых автомобилей = B = Small class
// LADA Kalina

public class B_Class extends CarSegments {
    int numberOfOldSeats; //количество старых сидений в салоне.


    public B_Class(int price, double fuelConsumption, int maxSpeed, int numberOfAirbag, int numberOfOldSeats) {
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
    public int getNumberOfAirbag() { //заглушил ,т.к. B-class не имеет подушек бехопасности
        return 0;
    }

    @Override
    public String toString() {
        return "B_Class on average consists of the following characteristics: " +
                "Number of old seats= " + numberOfOldSeats + " Price= "+price +" Fuel consumption= "+fuelConsumption+ " Max speed= "+maxSpeed
                ;
    }
}
