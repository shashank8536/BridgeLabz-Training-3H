package programmingelements.Level2;

import java.util.*;

public class IntOperation {
    public static void intOperation(){
            Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result1 = a + b * c;   
        int result2 = a * b + c;  
        int result3 = c + a / b;   
        int result4 = a % b + c;   

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
    }
    public static void main(String[] args) {
        intOperation();
    }
    
}