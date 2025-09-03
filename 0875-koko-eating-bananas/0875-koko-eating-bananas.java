class Solution {
    
    public boolean check(int[] piles,int mid,int h)
    {
         long totalhour=0L;
        for(int i=0;i<piles.length;i++)
        {
            totalhour +=(piles[i]+mid-1)/mid;
        }
        
        return totalhour<=h;
    }
    
    
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int high=piles[0];
        for(int i=0;i<piles.length;i++)
        {
            if(high<piles[i])
            high=piles[i];;
        }
          int res=high;
        while(lo<=high)
        {
          int mid=(lo+high)/2;
          if(check(piles,mid,h)==true)
          {
            res=mid;
            high=mid-1;
          }
          else
          {
            lo=mid+1;
          }  
        }
        
        return res;
    }
}