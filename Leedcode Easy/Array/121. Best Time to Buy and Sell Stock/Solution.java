public class Solution {

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i > 0 && prices[i] > prices[i - 1]) {
                if (max < prices[i]) {
                    max = prices[i];
                } else if (min > prices[i]) {
                    min = prices[i - 1];
                }
            } else if (i == 0) {
                max = prices[i];
                min = prices[i];
            }
            System.out.println("max" + max);
            System.out.println("min" + min);
        }

        int indexOfMax = 0;
        int indexOfMin = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == max) {
                indexOfMax = i;
            } else if (prices[i] == min) {
                indexOfMax = i;
            }
        }
        if (indexOfMax < indexOfMin) {
            profit = max - min;
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 10, 3, 40, 50 };
        System.out.println(maxProfit(prices));
    }
}
