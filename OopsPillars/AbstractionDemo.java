package OopsPillars;


interface Vehicle {
    void drive();   // abstract method
    void stop();    // abstract method
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();  
        v.drive();
        v.stop();
    }
}

