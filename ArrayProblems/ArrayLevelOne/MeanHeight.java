package ArrayProblems.ArrayLevelOne;
import java.util.*;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the height of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean height of football team = " + mean);
    }
}
