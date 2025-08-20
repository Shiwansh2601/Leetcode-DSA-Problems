class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] diff1=new int[n];
        int[] diff2=new int[n];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int maxpro=0;

        for(int i=0;i<n;i++)
        {
            min=Math.min(min,prices[i]);
            int profit=prices[i]-min;
            maxpro=Math.max(maxpro,profit);
            diff1[i]=maxpro;

        }
        
        maxpro=0;
        for(int i=n-1;i>=0;i--)
        {
            max=Math.max(max,prices[i]);
            int profit=max-prices[i];
            maxpro=Math.max(maxpro,profit);
            diff2[i]=maxpro;

        }

        int res=0;
        for(int i=0;i<n;i++)
        {
            res=Math.max(res,diff1[i]+diff2[i]);
        }
       
       int edge=Math.max(diff1[n-1],diff2[0]);
        
        return Math.max(res,edge);
    }
}