class Solution {
    public long maximumSumOfHeights(int[] heights) {
        long ans=0L;

        int k=0;
        while(k<heights.length)
        {  
            long sum=heights[k];

            long cap=heights[k];
            for(int i=k-1;i>=0;i--)
            {
                cap=Math.min(cap,heights[i]);
                sum+=cap;
            }

            cap=heights[k];
            for(int i=k+1;i<heights.length;i++)
            {
                cap=Math.min(cap,heights[i]);
                sum+=cap;
            }
            if(sum>ans)
            ans=sum;
            k++;
        }
        

         return ans;  
    }
}