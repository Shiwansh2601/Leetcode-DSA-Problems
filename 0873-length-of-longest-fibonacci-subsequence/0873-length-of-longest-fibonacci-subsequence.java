class Solution {
     Map<Integer,Integer>index=new HashMap<>();
    int[] arr;
    Integer[][] dp;
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        this.arr=arr;
        
        dp=new Integer[n][n];

        

        for(int i=0;i<n;i++)
        {
            index.put(arr[i],i);
        }
         
         int ans=0;
       


        for(int j=1;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                int len=solve(j,k);
                if(len>2)
                {
                    ans=Math.max(ans,len);
                }
            }
        }

        return ans;
    }

    public int solve(int j,int k)
    {

        if(dp[j][k]!=null)return dp[j][k];


        int x= arr[k]-arr[j];

        if(index.containsKey(x) && index.get(x)<j)
        {
            int i=index.get(x);

            return solve(i,j)+1;
        }
        return 2;
    }
}