package OopsPillars;

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called. Brand: " + brand);
    }

    public abstract void drive();
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println(brand + " car is driving...");
    }
}


public class AbstractionConstructorDemo {
    public static void main(String[] args) {
        Car c = new Car("BMW");
        c.drive();
    }
}
