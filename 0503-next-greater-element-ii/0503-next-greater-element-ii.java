class Solution {
    public int[] nextGreaterElements(int[] nums) {
       Stack<Integer>stk=new Stack<>();
        int ans[]=new int[nums.length];
        for(int i=nums.length*2-1;i>=0;i--)
        {
            while(stk.size()>0  && stk.peek()<=nums[i%nums.length])
            {
                stk.pop();
            }
          if(i<nums.length)
          {
            if(stk.isEmpty())
            ans[i]=-1;
            else
            ans[i]=stk.peek();
          }

            stk.push(nums[i%nums.length]);
        }

        return ans;
    }
}