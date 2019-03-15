package lessons._8;


public class Car {
    int id;
    String marka;
    String model;
    int year;
    String color;
    int price;
    int registration_number;

    public Car(int id, String marka, String model, int year, String color, int price, int registration_number) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registration_number = registration_number;
    }
    public int workingYears() {
        return 2019 - year;
    }
}
