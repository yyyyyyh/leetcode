/**
 * [121. 买卖股票的最佳时机](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/)
 */
public class bestTimeToBuyAndSellStock121 {

    public int maxProfit(int[] prices) {
        int max = Integer.MAX_VALUE;
        int val = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < val){
                val = prices[i];
            }
            if((prices[i] - val) > max){
                max = prices[i] - val;
            }
        }

        return max;
    }

}
