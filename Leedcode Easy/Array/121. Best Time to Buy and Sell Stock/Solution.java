public class Solution {

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = 10000;
        int profit = 0;
        int decreaseTimes = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i > 0 && prices[i] > prices[i - 1]) {
                if (min >= prices[i - 1]) {
                    min = prices[i - 1];
                    max = prices[i];
                } else if (max <= prices[i]) {
                    max = prices[i];
                }
            } else {
                decreaseTimes++;
            }
            if (profit < max - min) {
                profit = max - min;
            }
        }

        if (decreaseTimes == prices.length) {
            profit = 0;
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 10, 3, 40, 50 };
        System.out.println(maxProfit(prices));
    }
}
