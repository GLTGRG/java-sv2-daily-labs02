package day04;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setFuel(50);
        car.setKm(600);
        System.out.println(car.calcConsumption());

        GasStation gasStation = new GasStation(468);

        System.out.println("Tankolás ára: " + gasStation.tankCar(car, 40));

        car.setKm(635);

        System.out.println("Átlagfogyasztá: " + car.calcConsumption());
    }

}
