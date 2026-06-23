class Solution {
    HashMap<Character,Integer>map=new HashMap<>();
    int mod=1000000007;
    public int distinctSubseqII(String s) {
        int n=s.length();
      long[] dp=new long[n+1];
         dp[0]=1L;
      for(int i=1;i<=n;i++)
      {
          
          long dubli=0L;

          if(map.containsKey(s.charAt(i-1)))
          {
             dubli=dp[map.get(s.charAt(i-1))];
          }
          dp[i]=(2*dp[i-1]-dubli)%mod;

          map.put(s.charAt(i-1),i-1);


      }
        

        return (int)(dp[n]-1+mod)%mod;
    }

    
}