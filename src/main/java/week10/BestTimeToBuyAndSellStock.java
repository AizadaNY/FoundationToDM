package week10;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int lowest_price = prices[0];
        int max_profit = 0;
        for(int todays_price : prices){
            max_profit = Math.max(max_profit, todays_price - lowest_price);
            lowest_price = Math.min(lowest_price,todays_price);
        }
        return max_profit;
    }
}
