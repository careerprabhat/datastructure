package a_Simple;

public class D_StockBuySell {
    public static void main(String[] args) {
        int[] prices = {7, 2, 5, 1, 6, 4};
        System.out.println(maxProfit(prices)); // Output: 5
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update the maximum profit
            }
        }

        return maxProfit;
    }
}
