class Solution {
    public long maximumSumOfHeights(int[] heights) {
        long ans=0L;

        int k=0;
        while(k<heights.length)
        {  
            long sum=heights[k];

            int i=k-1;
            int max=heights[k];
            while(i>=0)
            {
                  
                    max=Math.min(max,heights[i]);
                    sum+=max;

                
                i--;
            }

            i=k+1;
            max=heights[k];
            while(i<heights.length)
            {
                    max=Math.min(max,heights[i]);
                    sum+=max;

                i++;
            }
            if(sum>ans)
            ans=sum;
            k++;
        }
        

         return ans;  
    }
}