class Solution {
    public int longestArithSeqLength(int[] nums) {
        
         int n = nums.length;

         if(n<=2)return n;

        int[][] dp = new int[n][1003];

       

        int ans = 0;

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                int diff=nums[i]-nums[j]+501;

                dp[i][diff]=dp[j][diff]>0?dp[j][diff]+1:2;

                ans = Math.max(ans, dp[i][diff]);
            }

           
        }

        return ans;
    }
}