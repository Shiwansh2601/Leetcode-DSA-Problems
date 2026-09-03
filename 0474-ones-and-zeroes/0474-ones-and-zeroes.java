class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        List<List<Integer>>list=new ArrayList<>();
        int len=strs.length;
        for(int i=0;i<len;i++)
        {
            int one=0;
            int zero=0;

            for(int j=0;j<strs[i].length();j++)
            {
                char ch=strs[i].charAt(j);
                if(ch=='0')
                zero++;
                else
                one++;
            }

            List<Integer>pair=new ArrayList<>();
            pair.add(zero);
            pair.add(one);
            list.add(pair);
        }

        Integer[][][] dp=new Integer[len][m+1][n+1];

       return solve(0,m,n,list,dp);
        
    }


    public int solve(int i,int m,int n,List<List<Integer>>list,Integer[][][] dp)
    {
        if(i>=list.size() ||( m==0 && n==0))return 0;

        if(dp[i][m][n]!=null)return dp[i][m][n];

        int take=0;
        int c0=list.get(i).get(0);
        int c1=list.get(i).get(1);

        if(c0<=m && c1<=n)
        take=1+solve(i+1,m-c0,n-c1,list,dp);

        int notake=solve(i+1,m,n,list,dp);

        return dp[i][m][n]=Math.max(take,notake);
    }
}