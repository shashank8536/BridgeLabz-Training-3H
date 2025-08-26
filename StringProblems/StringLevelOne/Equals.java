package StringProblems.StringLevelOne;

import java.util.Scanner;

public class Equals {

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean customCompare = compareStrings(str1, str2);
        boolean builtInCompare = str1.equals(str2);

        if (customCompare == builtInCompare) {
            System.out.println("✅ Both methods give the same result.");
        } else {
            System.out.println("❌ Results differ!");
        }

        sc.close();
    }
}
