package _10;
import  java.util.Arrays;


public class Runner {
    public static void main(String[] args) {
        CarSegments[] cars = {
                new B_Class(20000,7,180,0,4),
                new E_Class(50000,15,240,4,7),
                new F_Class(100000,18,320,8,4)
        };
        System.out.println("INFORMATION ABOUT CARS IN THE TAXI PARK");
        TaxiPark endTask = new TaxiPark(cars);
        System.out.println(endTask.CostOfAllCars());
        System.out.println(" ");

        System.out.println(endTask);
        System.out.println(" ");

        endTask.sortByFuelConsumption();
        System.out.println(endTask);



        System.out.println(Arrays.toString(endTask.searchMaxSpeed(0,200)));
        System.out.println(endTask.searchMaxSpeed(0,200));



    }

}
