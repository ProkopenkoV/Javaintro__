package _10;

import _10_Interfaces.Car_Interface;

public abstract class CarSegments implements Car_Interface {
    public int price;
    public int fuelConsumption;
    public int maxSpeed;
    public int numberOfAirbag;

    public CarSegments(int price, int fuelConsumption, int maxSpeed, int numberOfAirbag) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.numberOfAirbag = numberOfAirbag;
    }

    public int getNumberOfAirbag() {

        return numberOfAirbag;
    }

    public void setNumberOfAirbag(int numberOfAirbag) {

        this.numberOfAirbag = numberOfAirbag;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        }

    @Override
    public String toString() {
        return "CarSegments{" +
                "price=" + getPrice() +
                ", fuelConsumption=" + getFuelConsumption()+
                ", maxSpeed=" + getMaxSpeed() +
                ", numberOfAirbag=" + getNumberOfAirbag() +
                '}';
    }
   abstract public String WhatIsThisCar (String qualit);
}

