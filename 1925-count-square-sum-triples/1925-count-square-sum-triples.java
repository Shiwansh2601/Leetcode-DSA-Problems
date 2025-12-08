class Solution {
    public int countTriples(int n) {
        if(n<5)
        return 0;
        
        int count=0;
        for(int i=3;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                double num= Math.sqrt(i*i+j*j);
                if(num<=n && num%1==0)
                count+=2;
            }
        }
        return count;
    }
}