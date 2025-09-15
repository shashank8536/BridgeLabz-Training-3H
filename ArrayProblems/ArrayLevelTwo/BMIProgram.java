import java.util.*;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1));

            double weight, height;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
            } while (weight <= 0);

            do {
                System.out.print("Enter height (meters): ");
                height = sc.nextDouble();
            } while (height <= 0);

            double bmi = weight / (height * height);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 24.9)
                weightStatus[i] = "Normal";
            else if (bmi < 29.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                    " | Weight: " + personData[i][0] +
                    " | Height: " + personData[i][1] +
                    " | BMI: " + String.format("%.2f", personData[i][2]) +
                    " | Status: " + weightStatus[i]);
        }
    }
}
