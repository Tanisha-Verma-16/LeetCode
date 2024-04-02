class Solution {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int diff = 0;
        for (int i = 0; i < prices.length; i++)
        {
            for (int j = i + 1; j < prices.length && prices[i] < prices[j]; j++)
            {
                diff =  prices[j] - prices[i];
                if (diff > profit)
                { 
                    profit = diff;
                    System.out.println(profit + " " + diff + " "+prices[i] +" "+ prices[j]);
                }
                
            }
        }
        return profit;
    }
}
