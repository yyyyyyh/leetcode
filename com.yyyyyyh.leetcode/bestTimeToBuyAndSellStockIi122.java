/**
 * [122. 买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/)
 */
public class bestTimeToBuyAndSellStockIi122 {

    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 1; i < prices.length; i++){
            int diff = prices[i] - prices[i - 1];
            if(diff > 0){
                sum += diff;
            }
        }
        return sum;
    }

}
