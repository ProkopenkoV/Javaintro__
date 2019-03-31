package _10;
import  java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        CarSegments[] cars = new CarSegments[]{
                new LadaKalina(13000,6,160,2,5),
                new JaguarXJ(100000,15,300,9,8),
                new AudiA7(70000,12,240,10,7),



        };
        System.out.println("INFORMATION ABOUT CARS IN THE TAXI PARK");

        TaxiPark endTask = new TaxiPark(cars);

        CarSegments[] end;

        System.out.println(endTask.CostOfAllCars());

        System.out.println(" ");

        end=endTask.getcarsByMaxSpeed(320,280);




        for(int i = 0; i < end.length; i++)
            System.out.println(end[i].toString());



    }

}























/*System.out.println(endTask);
        System.out.println(" ");*/

       /* endTask.sortByFuelConsumption();
        System.out.println(endTask);*/




       /* System.out.println(Arrays.toString(endTask.searchMaxSpeed(0,10)));

        System.out.println();*/
