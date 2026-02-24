public class BuyAndSellStock {
    public static int findProfit(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};
        int profit = findProfit(prices);
        System.out.println("Maximum profit is : " + profit);
    }
}
