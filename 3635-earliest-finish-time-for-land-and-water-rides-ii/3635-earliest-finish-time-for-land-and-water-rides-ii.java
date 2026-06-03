class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        
        int minl=300000;
        int minw=300000;
        int res=300000;

        int n=landStartTime.length;
        int m=waterStartTime.length;

        for(int i=0;i<n;i++)
        {
            minl=Math.min(minl,landStartTime[i]+landDuration[i]);
        }

        for(int i=0;i<m;i++)
        {
            minw=Math.min(minw,waterStartTime[i]+waterDuration[i]);
        }

        for(int i=0;i<n;i++)
        {
            res=Math.min(res,Math.max(landStartTime[i],minw)+landDuration[i]);
        }

         for(int i=0;i<m;i++)
        {
            res=Math.min(res,Math.max(waterStartTime[i],minl)+waterDuration[i]);
        }


        return res;
    }
}