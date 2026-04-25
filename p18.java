import java.util.Scanner;

abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuel;

    Car(String fuel) {
        this.fuel = fuel;
    }

    String fuelType() {
        return fuel;
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuel;

    Bike(String fuel) {
        this.fuel = fuel;
    }

    String fuelType() {
        return fuel;
    }

    int noOfWheels() {
        return 2;
    }
}

public class p18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fuel type for Car (Petrol/Diesel): ");
        String carFuel = sc.nextLine();

        System.out.print("Enter fuel type for Bike (Petrol): ");
        String bikeFuel = sc.nextLine();

        Vehicle car = new Car(carFuel);
        Vehicle bike = new Bike(bikeFuel);

        System.out.println("\n--- Vehicle Details ---");

        System.out.println("Car Fuel Type: " + car.fuelType());
        System.out.println("Car Wheels: " + car.noOfWheels());

        System.out.println("\nBike Fuel Type: " + bike.fuelType());
        System.out.println("Bike Wheels: " + bike.noOfWheels());

        sc.close();
    }
}