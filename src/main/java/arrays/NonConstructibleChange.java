package arrays;

import java.util.Arrays;

public class NonConstructibleChange {

    /**
     *
     Given an array of positive integers representing the values of coins in your possession,
     write a function that returns the minimum amount of change (the minimum sum of money) that you cannot create.
     The given coins can have any positive integer value and aren’t necessarily unique (i.e., you can have multiple coins of the same value).

     For example, if you’re given coins = [1, 2, 5], the minimum amount of change that you can’t create is 4.
     If you’re given no coins, the minimum amount of change that you can’t create is 1.

     Sample Input:
     coins = [5, 7, 1, 1, 2, 3, 22]
     Sample Output:
     20
     */

    public static int nonConstructibleChange(int[] coins) {
        if (coins.length == 0) {
            return 1;
        }
        Arrays.sort(coins);

        int change = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= change + 1) {
                change += coins[i];
            } else {
                return change + 1;
            }
        }
        return change + 1;
    }

    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};

        int[] coins2 = {1,2,22,8989};
        System.out.println(nonConstructibleChange(coins2));
    }
}
