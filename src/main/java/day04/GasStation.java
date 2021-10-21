package day04;

import java.util.Scanner;

public class GasStation {

    int price;

    public GasStation(int price){
        this.price = price;
    }

    public int tankCar(Car car, int liter){
        car.setFuel(liter);
        return liter*price;
    }

}
