package _10_Interfaces;




public class AudiQ8 implements Car_Interface {
    private int price;


    @Override
    public int getNumberOfAirbag() {
        return 0;
    }

    @Override
    public void setNumberOfAirbag(int numberOfAirbag) {

    }

    public int getPrice(int price){
        int res=0;
        System.out.print("\n3. Audi Q8 starting at $ ");
        res=res+price;
        return res;

    }
   public void setPrice(int price){
       this.price=price;
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
