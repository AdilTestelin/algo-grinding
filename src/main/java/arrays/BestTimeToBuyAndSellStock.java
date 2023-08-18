package arrays;

public class BestTimeToBuyAndSellStock {

    public static int maxProfitBruteforce(int[] prices) {
        int result = 0;

        if (prices.length == 2) {
            return Math.max(prices[1] - prices[0], result);
        }

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > result && j > i) {
                    result = prices[j] - prices[i];
                }
            }
        }

        return result;
    }

    public static int maxProfitBetterSolution(int[] prices) {
        int minimalBuyValue = Integer.MAX_VALUE;
        int maxProfit = 0;
        int todayProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < minimalBuyValue) { // On calcule le prix le moins cher
                minimalBuyValue = prices[i];
            }

            todayProfit = prices[i] - minimalBuyValue; // On calcule la somme si on vend aujourd'hui
            if (todayProfit > maxProfit) {
                maxProfit = todayProfit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 4};
        System.out.println(maxProfitBruteforce(prices));
    }
}
