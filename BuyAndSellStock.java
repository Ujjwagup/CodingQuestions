package Arrays;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minimal = 100000;
        int profit =0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minimal )
                minimal = prices[i];
            if (prices[i]- minimal > profit)
                profit = prices[i]- minimal;
        }
    return profit;
    }

    public static void main(String[] args) {
         new BuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }
}
