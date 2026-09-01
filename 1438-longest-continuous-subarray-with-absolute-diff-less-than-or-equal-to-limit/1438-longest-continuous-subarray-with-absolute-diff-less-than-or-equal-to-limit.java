class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n=nums.length;
        int ans=0;
        Deque<Integer>maxq=new ArrayDeque<>();
        Deque<Integer>minq=new ArrayDeque<>();

        int left=0;
        int right=0;

        while(right<n)
        {
            while(!maxq.isEmpty() && nums[maxq.peekLast()]<=nums[right])
            maxq.pollLast();

            maxq.offerLast(right);


             while(!minq.isEmpty() && nums[minq.peekLast()]>=nums[right])
              minq.pollLast();

            minq.offerLast(right);

            
            while((nums[maxq.peekFirst()]-nums[minq.peekFirst()])>limit)
            {
                if(left==maxq.peekFirst()) maxq.pollFirst();

                if(left==minq.peekFirst()) minq.pollFirst();

                left++;

            }
             

             ans=Math.max(ans,right-left+1);


             right++;


        }

        return ans;

    }
}