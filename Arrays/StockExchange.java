/**
 * StockExchange
 */
public class StockExchange {

    public static int bestTimeToSell(int prices[]){
        // * To hold the stock minimum price
        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (int i = 0; i < prices.length; ++i) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}