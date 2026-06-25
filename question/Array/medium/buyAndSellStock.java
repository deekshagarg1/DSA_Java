// // buyAndSellStock----121. Best Time to Buy and Sell Stock
// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Example 1:
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.




import java.util.Arrays;
public class buyAndSellStock{

 public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxprof = 0;
        int i =0;
        int n = prices.length;
         while( i < n ){

            int profit = prices[i] - minPrice; 

            if(profit > maxprof){
                maxprof = profit;
            }

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            i++;
         }

// //direct solution--------------------
//         for(int i =0 ; i < prices.length ; i++){
//             int cost = prices[i] - minPrice;
//             minPrice = Math.min(prices[i] , minPrice);
//             maxprof = Math.max(cost, maxprof);
//         }

        return maxprof;
    }


    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Array is : " +Arrays.toString(prices));

        buyAndSellStock obj = new buyAndSellStock();
        int ans = obj.maxProfit(prices);
        System.out.println("maximum profit is : " +ans);
    }
}
