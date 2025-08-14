package programmingelements.Level1;

import java.util.Scanner;

public class distanceFeetToYardMiles {
    public static void DistanceFeetToYardMiles(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("The distance is " + yards + " yards and " + miles + " miles");

    }
    public static void main(String[] args) {
        DistanceFeetToYardMiles();
    }
}
