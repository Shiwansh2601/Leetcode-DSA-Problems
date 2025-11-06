class Solution {
    public int[] secondGreaterElement(int[] nums) {
        int n=nums.length;
        Stack<Integer>stk1=new Stack<>();
        Stack<Integer>stk2=new Stack<>();
        Stack<Integer>temp=new Stack<>();
        int[] res=new int[n];
        Arrays.fill(res,-1);

        for(int i=0;i<n;i++)
        {
            int curr=nums[i];
            while(!stk2.isEmpty() && nums[stk2.peek()]<curr)
                res[stk2.pop()]=curr;
            

            while(!stk1.isEmpty() && nums[stk1.peek()]<curr )
                temp.push(stk1.pop());
            

             while(!temp.isEmpty() )
                stk2.push(temp.pop());

            stk1.push(i);
        }

       
        return res;
    }
}