class Solution {
    public int longestSubsequence(int[] nums, int diff) {
        
        int n = nums.length;
        

         if(n<=2)return n;

        HashMap<Integer,Integer>dp=new HashMap<>();

       

        int ans = 0;

        for (int i = 0; i < n; i++) {
             
             int prev=nums[i]-diff;
             int curr=dp.getOrDefault(prev,0)+1;

             dp.put(nums[i],curr);
            
            ans = Math.max(ans,curr);

        }

        return ans;
    }
}