class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                int pro = prices[j]-prices[i];
                maxpro=Math.max(pro,maxpro);
            }
        }
        return maxpro;
    }
}

