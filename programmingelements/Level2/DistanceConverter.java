package programmingelements.Level2;
import java.util.*;

public class DistanceConverter {

    public static void distanceInYardsAndMiles() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards +
                           " while the distance in miles is " + distanceInMiles);
    }

    public static void main(String[] args) {
        distanceInYardsAndMiles(); 
    }
}
