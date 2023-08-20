package arrays;

import java.util.Arrays;

public class NonConstructibleChange {

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

        int[] coins2 = {7, 5, 6, 2, 3, 1, 5, 6, 8};
        System.out.println(nonConstructibleChange(coins2));
    }
}
