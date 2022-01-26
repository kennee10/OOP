public class VehicleTest {
    public static void main(String[] args) {
        Motorcycle m = new Motorcyle(200);
    }
}

class Vehicle {
    private int numWheels;
    private double distancePerLiter;

    public Vehicle(int numWheels, double distancePerLiter) {
        this.numWheels = numWheels;
        this.distancePerLiter = distancePerLiter;
    }

    public String toString() {
        return "Vehicle[numWheels=" + this.numWheels + ", distancePerLiter=" + this.distancePerLiter + "]";
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(double distancePerLiter) {
        super(2, distancePerLiter);
    }
}

class Car extends Vehicle {
    public Car(double distancePerLiter) {
        super(4, distancePerLiter);
    }
}