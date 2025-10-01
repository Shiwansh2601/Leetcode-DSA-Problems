class Solution {
   
    public int countPrimes(int n) {

        if(n==0 || n==1||n==2)
        return 0;
        boolean[] prime=new boolean[n];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i]==true)
            {   int exp=2;
                while(i*exp<n)
                {
                    prime[i*exp]=false;
                    exp++;
                }
            }
        }
        int count=0;
        for(int i=0;i<prime.length;i++)
        {
            if(prime[i]==true)
            count++;
        }
       
       return count;
    }
}