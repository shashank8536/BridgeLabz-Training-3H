package Constructor.Level_1;

public class Circle {
    private double radius;

    public Circle() {
        this(1.0);   
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();     
        Circle c2 = new Circle(4.5);   

        System.out.println("Area of c1: " + c1.calculateArea());
        System.out.println("Area of c2: " + c2.calculateArea());
    }
}

