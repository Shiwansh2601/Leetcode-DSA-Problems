class Solution {
    public double myPow(double x, long n) {
    
        if(n==0)
        {
            return 1;
        }
        long m=n;
        if(n<0)
        m=-n;

        double ans=1;
       while(m>0)
       {
        if(m%2==1)
        {
            ans*=x;
        }

        x=x*x;
        m/=2;
       }
       
       return n<0?1/ans:ans;
    }
}