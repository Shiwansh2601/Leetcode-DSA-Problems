class Solution {
    String str;
    int n;
    Integer[] dp;
    boolean[][] pal;
    public int minCut(String s) {
        str=s;
        n=str.length();
        
        pal=new boolean[n][n];

         for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {

                if (str.charAt(i) == str.charAt(j) &&
                    (j - i <= 2 || pal[i + 1][j - 1])) {

                    pal[i][j] = true;
                }
            }
        }
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
            

            if(pal[i][j])
            {
                int cost=1+solve(j+1);

                min=Math.min(min,cost);
            }

        }
        
        dp[i]=min;
        return min;
    }

}