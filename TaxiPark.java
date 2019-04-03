package _10;

import _10_Interfaces.TaxiPark_Interface;

class TaxiPark implements TaxiPark_Interface {
    public CarSegments[] cars;
    public CarSegments car;

    TaxiPark(CarSegments[] cars) {
        this.cars = cars;
    }

    public int CostOfAllCars() {
        System.out.println(" ");
        System.out.print("1. Cost of all cars : $ ");

        int cost = 0;
        for (int i = 0; i < cars.length; i++) {
            CarSegments car = cars[i];
            cost += car.getPrice();
        }


        return cost;

    }

    public void sortByFuelConsumption() {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getFuelConsumption() > cars[i].getFuelConsumption()) {
                    CarSegments temp = cars[j];
                    cars[j] = cars[i];
                    cars[i] = temp;
                }
            }
        }
    }

    public CarSegments[] getCarsByMaxSpeed(int min, int max) {
        System.out.print("\n2. ");
        CarSegments[] temp = cars;
        for (int i = 0; i < cars.length; i++) {
            if (!(cars[i].getMaxSpeed() >= min && cars[i].getMaxSpeed() <= max)) {
                temp = removingElementByIndex(temp, i);
            }
        }
        return temp;
    }

    public CarSegments[] arrayCopyAndPlusOneElement(CarSegments[] car) {
        CarSegments[] temp = new CarSegments[car.length+1];
        for (int i = 0; i < car.length; i++)
            car[i] = temp[i];
        return temp;
    }

    public String toString(CarSegments auto) {
        return "CarSegments{" +
                "price=" + auto.getPrice() +
                ", fuelConsumption=" + auto.getFuelConsumption() +
                ", maxSpeed=" + auto.getMaxSpeed() +
                ", numberOfAirbag=" + auto.getNumberOfAirbag() +
        '}';
    }

    public CarSegments[] removingElementByIndex(CarSegments [] cars ,int index){
        CarSegments[] newCars = new CarSegments[cars.length-1];
        for(int i = 0, j = 0; j < newCars.length; i++, j++){
            if(index==i){
                j--;
            }else {
                newCars[j]=cars[i];
            }
        }
        return newCars;
    }


}
    









