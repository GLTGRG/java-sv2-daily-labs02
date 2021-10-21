package day04;

public class Car {

    int fuel;
    int km;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double calcConsumption(){
        return ((fuel*1.0)/km)*100;
    }
}
