class Solution {
    String str;
    int n;
    Integer[] dp;
    Boolean[][] pal;
    public int minCut(String s) {
        str=s;
        n=str.length();
        
        pal=new Boolean[n][n];


        dp=new Integer[n];
        return solve(0)-1;
    }

    public int solve(int i)
    {

        if(i==n)return 0;

        if(dp[i]!=null)return dp[i];

        int min=Integer.MAX_VALUE;

        StringBuilder temp=new StringBuilder();

        for(int j=i;j<n;j++)
        {
            

            if(isPos(i,j))
            {
                int cost=1+solve(j+1);

                min=Math.min(min,cost);
            }

        }
        
        dp[i]=min;
        return min;
    }

    public boolean isPos(int i,int j)
    {
        if(j==i)return true;

         if(pal[i][j]!=null)return pal[i][j];


        if(str.charAt(i)==str.charAt(j) && (j-i<=2 || isPos(i+1,j-1)))
        return pal[i][j]=true;
        else
        return pal[i][j]=false;
    }
}