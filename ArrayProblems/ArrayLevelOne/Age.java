package ArrayProblems.ArrayLevelOne;
import java.util.*;


public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println("Invalid no");
            }else if (arr[i]<18) {
                System.out.println("The Student with" +arr[i]+ "cannot vote");
            }
            else{
                System.out.println("The Student with" +arr[i]+ "can vote");
            }
        }
    }
}
