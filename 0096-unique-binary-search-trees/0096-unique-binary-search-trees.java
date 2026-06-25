class Solution {
    public int numTrees(int n) {
        long val=ncr(2*n,n);
        return (int)(val/(n+1));
    }

    public long ncr(int n,int r)
    {
        if(r>n-r)
        r=n-r;
        long ans=1L;

        for(int i=0;i<r;i++)
        {
            ans*=(n-i);

            ans/=(i+1);
        }

        return ans;
    }
}