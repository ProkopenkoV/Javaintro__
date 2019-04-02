package _10_Interfaces;


import _10.CarSegments;

public interface TaxiPark_Interface {
    public int CostOfAllCars();
    public String retDol(String dol );
    public void sortByFuelConsumption();
    public CarSegments[] getcarsByMaxSpeed(int min, int max);
    public CarSegments[] copyArrAndPlusOneElement(CarSegments[] car);
    public CarSegments[] removingElementByIndex(CarSegments [] cars ,int index);
}
