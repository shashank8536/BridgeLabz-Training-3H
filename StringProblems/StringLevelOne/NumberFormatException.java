package StringProblems.StringLevelOne;

import java.util.Scanner;

public class NumberFormatException {

    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string (number or text): ");
        String input = sc.next();

        System.out.println("---- Generating NumberFormatException ----");
        try {
            generateException(input); 
        } catch (Exception e) {
            System.out.println("Program stopped due to exception: " + e);
        }

        System.out.println("\n---- Handling NumberFormatException ----");
        handleException(input);

        sc.close();
    }
}
