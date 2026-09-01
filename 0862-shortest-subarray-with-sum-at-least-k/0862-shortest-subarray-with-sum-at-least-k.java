class Solution {
    public int shortestSubarray(int[] nums, int k) {
       
       int ans=Integer.MAX_VALUE;
       Deque<long[]>que=new ArrayDeque<>();

       long sum=0;

       int r=1;
       int n=nums.length;

        que.offerLast(new long[]{0,0});
       while(r<=n)
       {
          sum+=nums[r-1];
         
         

          while(!que.isEmpty() && (sum-que.peekFirst()[0])>=k)
          {    
               ans=Math.min(ans,r-(int)que.pollFirst()[1]);

          }
            


         while(!que.isEmpty() && que.peekLast()[0]>=sum)
          que.pollLast();


          que.offerLast(new long[]{sum,r});

          r++;
  

       }

       return ans==Integer.MAX_VALUE?-1:ans;
    }
}