class Solution {
    public int maxProfit(int[] prices) {
        int minima=prices[0];
        int maxima=prices[0];

        int profit=0;
        boolean buy=false;
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[i+1]  && !buy)
            {
                minima=prices[i];
                buy=true;
            }
            if(prices[i]>prices[i+1] && buy)
            {
                maxima=prices[i];
                profit=profit+(maxima-minima);
                buy=false;
            }
        }
        if(buy)
        profit=profit+(prices[prices.length-1]-minima);

        return profit;
    }
}