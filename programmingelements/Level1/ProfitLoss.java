package programmingelements.Level1;

public class ProfitLoss {
    public static void profitloss(){
         int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit / (double) costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
        "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
    public static void main(String[] args) {
        profitloss();
    }
}
