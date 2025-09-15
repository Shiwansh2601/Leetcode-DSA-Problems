class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res =new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
    
        int i=0;
        int K=0;
        int indx=0;
        while(i<n)
        {
          if(!dq.isEmpty() && dq.peekFirst()<=i-k)
          dq.removeFirst();
          
          while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])
          {
            dq.removeLast();
          }
          
          dq.addLast(i);
          if(i>=k-1)
          {
            res[indx++]=nums[dq.peekFirst()];
          }
          
          i++;
        }
       return res;
    }
}



 