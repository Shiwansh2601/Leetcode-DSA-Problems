class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res=0L;
        int i=0;
        int n=happiness.length;
        while(k>0)
        {  
           if(happiness[n-1-i]-i >= 0)
           res+=(long)(happiness[n-1-i]-i);
           
           i++;
           k--;
        }
        return res;
    }
}