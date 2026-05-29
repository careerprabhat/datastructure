package a_Basic;

public class A_BestTimeToBuySellStock {
    public static void main(String[] args) {
        //use greedy approach
        int[] prices = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            int currentProfit = price - minPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        System.out.println("Maximum profit: " + maxProfit);
    }
}
