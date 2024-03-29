//买卖股票的最佳时机II
public class test122 {
    //暴力法
//    public int maxProfit(int[] prices) {
//        return calculate(prices, 0);
//    }
//
//    public int calculate(int[] prices, int s) {
//        if (s >= prices.length) {
//            return 0;
//        }
//        int max = 0;
//        for (int start = s; start < prices.length; start++) {
//            int maxprofit = 0;
//            for (int i = start + 1; i < prices.length; i++) {
//                if (prices[start] < prices[i]) {
//                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
//                    if (profit > maxprofit) {
//                        maxprofit = profit;
//                    }
//                }
//            }
//            if (maxprofit > max) {
//                max = maxprofit;
//            }
//        }
//        return max;
//    }

    //峰谷法
//    public int maxProfit(int[] prices) {
//        if (prices.length == 0) return 0;
//        int i = 0;
//        int valley = prices[0];
//        int peak = prices[0];
//        int maxprofit = 0;
//        while (i < prices.length - 1) {
//            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
//                i++;
//            //山谷
//            valley = prices[i];
//            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
//                i++;
//            //山峰
//            peak = prices[i];
//            maxprofit += peak - valley;
//        }
//        return maxprofit;
//    }

    //简单的一次遍历-根据峰谷法改编
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

}
