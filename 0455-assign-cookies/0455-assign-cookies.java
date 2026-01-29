class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        for(int i=g.length-1;i>=0;i--)
        {
            for(int j=0;j<s.length;j++)
            {
                if(s[j]>=g[i])
                {
                    count++;
                    s[j]=0;
                    break;
                }
            }
        }
        return count;
    }
}