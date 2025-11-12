class Solution {
    public int trailingZeroes(int n) {
        if(n==0 ||n==1)
        return 0;
        int c=0;
        long div=5;
        while(div<=n)
        {
            c=c+n/(int)div;
            div*=5;
        }
        return c;
    }
}