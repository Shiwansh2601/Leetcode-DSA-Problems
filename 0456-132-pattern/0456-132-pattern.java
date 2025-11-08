class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer>stk=new Stack<>();
        int num3=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--)
        {
           int n=nums[i];
           if(nums[i]<num3)
           return true;

           while(!stk.isEmpty() && nums[i]>stk.peek())
           num3=stk.pop();
        

            stk.push(n);
        }

        return false;
    }
}