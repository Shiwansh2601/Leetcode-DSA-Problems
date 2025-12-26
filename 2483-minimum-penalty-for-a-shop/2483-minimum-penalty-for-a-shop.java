class Solution {
    public int bestClosingTime(String customers) {
        int res=0;
        int n=customers.length();
        int[]pre=new int[n+1];
        int[]suf=new int[n+1];
        pre[0]=0;
        suf[n]=0;
        
        for(int i=0;i<n;i++)
        {
             if(customers.charAt(i)=='N')
             pre[i+1]=pre[i]+1;
             else
             pre[i+1]=pre[i];
        }

        
        for(int i=n-1;i>=0;i--)
        {
             if(customers.charAt(i)=='Y')
             suf[i]=suf[i+1]+1;
             else
            suf[i]=suf[i+1];
        }
       int min=Integer.MAX_VALUE;
       for(int i=0;i<=n;i++)
       {
           int temp=min;
           min=Math.min(pre[i]+suf[i],min); 

           if(min<temp)
           res=i;
       }
       return res;
    }
}