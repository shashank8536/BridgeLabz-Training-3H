package programmingelements.Level2;

import java.util.*;

public class SquareSideFinder {
    public static void squaresidefinder(){
        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("The side of the square is " + side);

    }
    public static void main(String[] args) {
        squaresidefinder();
    }
}
