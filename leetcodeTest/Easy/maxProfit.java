package leetcodeTest.Easy;

/**
 * Create by Fuwen on 2021/2/11
 */
public class maxProfit {
        public int maxProfit(int prices[]) {
            int minprice = Integer.MAX_VALUE;
            int maxprofit = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < minprice) {
                    minprice = prices[i];
                } else if (prices[i] - minprice > maxprofit) {
                    maxprofit = prices[i] - minprice;
                }
            }
            return maxprofit;
        }

    public static void main(String[] args) {
        new maxProfit().maxProfit(new int[]{7,1,5,3,6,4});
    }
}
