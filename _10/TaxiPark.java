package _10;

import java.util.Arrays;

public class TaxiPark {
    private CarSegments [] cars;

    public TaxiPark(CarSegments[] cars) {
        this.cars = cars;
    }

    public int CostOfAllCars(){
        System.out.println(" ");
        System.out.print("1. Cost of all cars : ");
        int cost=0;
        for (int i = 0; i < cars.length; i++) {
            CarSegments car = cars[i];
            cost += car.getPrice();

        }

        return cost;
    }

    public void sortByFuelConsumption (){
        for (int i = 0; i < cars.length; i++) {
            for (int j = i+ 1; j < cars.length; j++) {
                if(cars[j].getFuelConsumption() > cars[i].getFuelConsumption()){
                    CarSegments temp= cars[j];
                    cars[j]=cars[i];
                    cars[i]=temp;
                }
            }
        }
    }

    public CarSegments [] searchMaxSpeed(int minSpeed, int maxSpeed) {
        CarSegments[] result = {};
        for (int i = 0; i < cars.length; i++) {
            CarSegments carByMaxSpeed = cars[i];
            if (carByMaxSpeed.getMaxSpeed() >= minSpeed && carByMaxSpeed.getMaxSpeed() <= maxSpeed) {
            result = addForCarSegmentsUp(carByMaxSpeed, result);
            }
        }
        return result;
    }
        private CarSegments[] addForCarSegmentsUp(CarSegments addNewCar, CarSegments[]cars) {
            if (cars.length == 0) {
                return new CarSegments[]{addNewCar};
            } else {
                CarSegments[] newAddCar = new CarSegments[cars.length + 1];
                for (int i = 0; i < cars.length; i++) {
                    newAddCar[i] = cars[i];

                }
                newAddCar[cars.length] = addNewCar;
                return newAddCar;
            }
        }

    public CarSegments[] getCars() {
        return cars;
    }

    public void setCars(CarSegments[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "TaxiPark "
                + Arrays.toString(cars)
                ;

    }

}








