package OopsPillars;

public abstract class Vehicle {
    public abstract void drive();  
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Vehicle v = new Car();  
        v.drive();
    }
}
