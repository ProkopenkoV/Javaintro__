package _10_Interfaces;



public class BMWX5 implements Car_Interface {


    @Override
    public int getNumberOfAirbag() {
        return 0;
    }

    @Override
    public void setNumberOfAirbag(int numberOfAirbag) {

    }

    @Override
    public int getPrice(int price) {
        int res=0;
        System.out.print("\n   Цена за автомобиль BMW X5  = ");
        res=res+price;
        return res;
    }

    @Override
    public void setPrice(int price) {

    }

    @Override
    public double getFuelConsumption() {
        return 0;
    }

    @Override
    public void setFuelConsumption(int fuelConsumption) {

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {

    }
}
