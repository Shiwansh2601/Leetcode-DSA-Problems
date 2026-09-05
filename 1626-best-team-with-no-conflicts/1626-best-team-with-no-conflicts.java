class Solution {

    public int bestTeamScore(int[] scores, int[] ages) {
        
        int n=ages.length;
        int[][] mat=new int[n][2];

        for(int i=0;i<n;i++)
        {
            mat[i][0]=ages[i];
            mat[i][1]=scores[i];
        }

        Arrays.sort(mat,(a,b)->{

            if(a[0]==b[0])
            return a[1]-b[1];

            return a[0]-b[0];
        });

        int[] dp=new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=mat[i][1];
        }
         
         int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(mat[j][1] <=mat[i][1])
                {
                    dp[i]=Math.max(dp[i],dp[j]+mat[i][1]);
                }
            }
            max=Math.max(max,dp[i]);

        }

        return max;

    }
}