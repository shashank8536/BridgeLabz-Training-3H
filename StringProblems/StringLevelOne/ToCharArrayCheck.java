package StringProblems.StringLevelOne;

import java.util.Scanner;

public class ToCharArrayCheck {

    public static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] manualArray = customToCharArray(text);
        char[] builtInArray = text.toCharArray();

        System.out.print("Manual char array: ");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in char array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nArrays are equal: " + compareArrays(manualArray, builtInArray));

        sc.close();
    }
}
