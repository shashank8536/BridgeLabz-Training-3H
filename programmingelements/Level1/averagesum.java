package programmingelements.Level1;

public class averagesum {
    public static void averageSum(){
        int maths = 94, physics = 95, chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam's average mark in PCM is " + average);
    }
    public static void main(String[] args) {
        averageSum();
    }
}
