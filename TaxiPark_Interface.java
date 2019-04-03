package _10_Interfaces;


import _10.CarSegments;

public interface TaxiPark_Interface {
    public int CostOfAllCars();
    public void sortByFuelConsumption();
    public CarSegments[] getCarsByMaxSpeed(int min, int max);
    public CarSegments[] arrayCopyAndPlusOneElement(CarSegments[] car);
    public CarSegments[] removingElementByIndex(CarSegments [] cars ,int index);
}
