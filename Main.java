package _10;


import _10_Interfaces.AudiQ8;
import _10_Interfaces.BMWX5;
import _10_Interfaces.Car_Interface;
import com.sun.org.apache.xpath.internal.SourceTree;

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

        System.out.print(endTask.CostOfAllCars());
        System.out.println(endTask.retDol("$"));

        System.out.println(" ");

        end=endTask.getcarsByMaxSpeed(0,245);




        for(int i = 0; i < end.length; i++)
            System.out.println(end[i].toString());

        Car_Interface audi = new AudiQ8();
        System.out.print(audi.getPrice(100000)+" $");
        Car_Interface bmw =  new BMWX5();
        System.out.print(bmw.getPrice(95000)+" $");

    }

}























/*System.out.println(endTask);
        System.out.println(" ");*/

       /* endTask.sortByFuelConsumption();
        System.out.println(endTask);*/




       /* System.out.println(Arrays.toString(endTask.searchMaxSpeed(0,10)));

        System.out.println();*/
