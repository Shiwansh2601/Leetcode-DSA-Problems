class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        if(n==1)
        return 1;


        for(int i=2;i<=n;i++)
        {
            int temp=0;

            for(int k1=0,k2=i-1;k1<=i-1 && k2>=0;k1++,k2--)
            {
                temp+=dp[k1]*dp[k2];
            }
            dp[i]=temp;
        }

        return dp[n];
    }
}