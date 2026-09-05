class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
       
        int n = nums.length;
        
        Arrays.sort(nums);

        int[] dp = new int[n];
        int[] par=new int[n];

        Arrays.fill(dp, 1);
        
        int indx=0;
        int ans = 1;

        for (int i = 0; i < n; i++) {

            par[i]=-1;

            for (int j = 0; j < i; j++) {

                if(nums[i]%nums[j]==0){

                    if(dp[j]+1>dp[i])
                    {
                        dp[i]=dp[j]+1;
                        par[i]=j;
                    }
                    
                }
            }

            if(dp[i]>ans)
            {
                ans=dp[i];
                indx=i;
            }
        }


        List<Integer>list=new ArrayList<>();
        while(indx!=-1)
        {
            list.add(nums[indx]);

            indx=par[indx];
        }

        Collections.reverse(list);

        return list;
    }
}