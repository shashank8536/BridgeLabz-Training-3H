package programmingelements.Level2;
import java.util.*;

public class QuotientAndRemainder {
    public static void QandR(){
         Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 =sc.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2);


    }
    public static void main(String[] args) {
        QandR();
    }
}
