package WorkshopPractise27Aug;

import java.util.*;

public class CricketScore{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of batsman");
        int n = sc.nextInt();
        int[] scores = new int[n];
        
        System.out.println("Enter runs scored by a batsman");
        for(int i=0;i<n;i++){
            scores[i]=sc.nextInt();
        }
        int highest = scores[0];
        int lowest = scores[0];
        int sum =0;

        for(int score:scores){
            if(score>highest){
                highest= score;
            }
            if(score<lowest){
                lowest = score;
            }
            // for sum
            sum+=score;

            if(score>=100){
                System.out.println("The batsman is scoring century");
            }
        }
        double average = (double) sum / scores.length;

        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + average);

    }
}

