class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[] curr=new int[text2.length()+1];
        int[] prev=new int[text2.length()+1];
        
        return solve(text1.length(),text2.length(),text1,text2,prev,curr);
    }

    public int solve(int n,int m,String s1,String s2,int[] curr,int[] prev)
    {

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                curr[j]=1+prev[j-1];
                else
                curr[j]=Math.max(curr[j-1],prev[j]);
            }

            prev=(int[])curr.clone();
        }

        return prev[m];
    }
}