package programmingelements.Level2;

import java.util.*;

public class DoubleOpt {
    public static void doubleopt(){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

    }
    public static void main(String[] args) {
        doubleopt();
    }
}

