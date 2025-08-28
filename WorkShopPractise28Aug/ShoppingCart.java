package WorkShopPractise28Aug;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] items = {"Mobile","Laptop","Headphone","Watch","Shoes"};
        int [] prices = {15000,70000,150,1500,7000,2500};

        boolean moreCustomers = true;

        while(moreCustomers){
            System.out.println("Welcome to our Online Shopping");

            int totalAmount=0;
            int addMore;

            do { 
                System.out.println("/n Show product menu");
                for(int i=0;i<items.length;i++){
                    System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]);
                }
                System.out.println("Enter product no to add to card");
                int choice = sc.nextInt();

                switch(choice){
                    case 1:
                    totalAmount+=prices[0];
                    break;

                    case 2:
                    totalAmount+=prices[1];
                    break;

                    case 3:
                    totalAmount+=prices[2];
                    break;

                    case 4:
                    totalAmount+=prices[3];
                    break;

                    case 5:
                    totalAmount+=prices[4];
                    break;

                    default:
                    System.out.println("Invalid choice try again");
                }
                System.out.println("Do you want to add more? (1=yes/0=no):");
                addMore=sc.nextInt();
            } while(addMore==1);
                if (totalAmount > 5000) {
                System.out.println("Congratulations! You get a 10% discount.");
                totalAmount -= (totalAmount * 10 / 100);

        }
        System.out.println("Final bill amount "+ totalAmount);
         System.out.print("\nNext customer? (1 = Yes / 0 = No): ");
            int next = sc.nextInt();
            if (next == 0) {
                moreCustomers = false;
            }
        }

        System.out.println("\n--- Thank you for shopping with us! ---");

    }
}
