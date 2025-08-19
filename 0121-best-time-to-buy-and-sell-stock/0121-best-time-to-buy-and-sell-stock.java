class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0;
        int min=10000;
        for(int i=0;i<prices.length;i++)
        {
             min=Math.min(min,prices[i]);
            int pro = prices[i]-min;
            maxpro=Math.max(pro,maxpro);
            
        }
        return maxpro;
    }
}
