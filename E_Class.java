package _10;

// Европейский сегмент легковых автомобилей = E = Executive cars
// Audi A7
public class E_Class extends CarSegments {



    public E_Class(int price, int fuelConsumption, int maxSpeed, int numberOfAirbag) {
        super(price, fuelConsumption, maxSpeed, numberOfAirbag);
    }


    public String WhatIsThisCar (String qualit){
        qualit="Good car...";
        String res=qualit;
        System.out.println(res);

        return res;
    }


    @Override
    public int getPrice(int price) {
        return 0;
    }
}
