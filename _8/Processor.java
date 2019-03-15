package lessons._8;
import java.util.*;

public class Processor {
    public void listOfMarka(Car[] cars, String zadMark){
        System.out.println("Auto:  "+zadMark);

    }
    //список авто заданной модели эксплуатирующихся больше n лет
    public void listOfModel(Car[] cars,String mmodel, int workingYears){
        System.out.println("Explotation since : "+mmodel+", "+workingYears+" year");
        for (Car car : cars){
            if (car.model.equals(mmodel)&& car.workingYears() > workingYears) {
                System.out.println(car);

            }

        }

    }
    public void listCarsOfYaerAndPrice(Car[] cars, int year, int price) {
        System.out.println("Year and price auto it's:  " + year + " year , " + price+"$");

        for (Car car : cars) {
            if (car.year == year && car.price > price) {
                System.out.println(car);
            }
        }
    }
    public void printCar (Car cars) {
        System.out.println("id = " + cars.id);
        System.out.println("Marka = " + cars.marka);
        System.out.println("Model = " + cars.model);
        System.out.println("Year = " + cars.year);
        System.out.println("Color = " + cars.color);
        System.out.println("Price = " + cars.price);
        System.out.println("Registration_number = " + cars.registration_number);

    }
}
