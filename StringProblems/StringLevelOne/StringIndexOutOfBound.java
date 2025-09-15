package StringProblems.StringLevelOne;

import java.util.Scanner;

public class StringIndexOutOfBound {

    public static void generateException(String text) {
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("---- Generating StringIndexOutOfBoundsException ----");
        try {
            generateException(input); 
        } catch (Exception e) {
            System.out.println("Program stopped due to exception: " + e);
        }

        System.out.println("\n---- Handling StringIndexOutOfBoundsException ----");
        handleException(input);

        sc.close();
    }
}
