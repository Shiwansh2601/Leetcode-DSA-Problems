class Solution {
    int[][] books;
    int sw;
    Integer[] dp;
    public int minHeightShelves(int[][] books, int shelfWidth) {
        this.books=books;
        sw=shelfWidth;
        
        dp=new Integer[books.length];
        return solve(0);
    }

    public int solve(int i)
    {
        if(i==books.length)return 0;

        if(dp[i]!=null) return dp[i];
        int cwid=0;
        int maxh=0;
        int ans=Integer.MAX_VALUE;
        
        for(int j=i;j<books.length;j++)
        {
            int w=books[j][0];
            int h=books[j][1];

            cwid+=w;
            if(cwid<=sw)
            {
               maxh=Math.max(maxh,h);
               int curr=maxh+solve(j+1);
                ans=Math.min(ans,curr);
            }
           

           
        }

        return dp[i]=ans;
    }
}