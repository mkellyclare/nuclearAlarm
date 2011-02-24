package com.dgarry.utils;

public class Car {


    int fuel;
    int type;

    private Car() {

    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public static Car createCar(int initalFuel) {
        Car car = new Car();
        car.type = 0;
        return car;
    }


    public static void main(String[] args) {
        Car car = new Car();

        Car.createCar(220);

    }
}
