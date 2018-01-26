import java.util.Arrays;
import java.util.Collections;

/*
*Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimeToBuyAndSellStock121 {

    public static void main(String args[]){

        int[] prices = { 7, 6, 4, 3, 1};

        Integer dp[] = new Integer[prices.length];
        dp[0]=0;
        int minSoFar = prices[0];

        for(int i = 1;i<dp.length;i++){
            dp[i]= Math.min(minSoFar,prices[i-1]);
            minSoFar=dp[i];
        }

        for(int i=1;i<dp.length;i++){
            dp[i]=prices[i]-dp[i];
        }

        int max = Collections.max(Arrays.<Integer>asList(dp));

        System.out.println(max);


    }


}
