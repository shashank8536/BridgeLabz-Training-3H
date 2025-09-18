import java.util.Scanner;
public class Factors {
    public static int[] findFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        int[] factors=new int[count];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) factors[index++]=i;
        }
        return factors;
    }
    public static int sumFactors(int[] arr){
        int sum=0;
        for(int x:arr) sum+=x;
        return sum;
    }
    public static int productFactors(int[] arr){
        int prod=1;
        for(int x:arr) prod*=x;
        return prod;
    }
    public static double sumSquareFactors(int[] arr){
        double sum=0;
        for(int x:arr) sum+=Math.pow(x,2);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] factors=findFactors(n);
        System.out.print("Factors: ");
        for(int x:factors) System.out.print(x+" ");
        System.out.println();
        System.out.println("Sum: "+sumFactors(factors));
        System.out.println("Product: "+productFactors(factors));
        System.out.println("Sum of Squares: "+sumSquareFactors(factors));
        sc.close();
    }
}