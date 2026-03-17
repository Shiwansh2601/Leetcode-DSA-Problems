class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumgas=0;
        int sumcost=0;
        int n=gas.length;
        for(int i=0;i<n;i++)
        {
            sumgas+=gas[i];
            sumcost+=cost[i];
        }

        if(sumcost>sumgas)
        return -1;

        int indx=0;
        int i=0;
       int cg=0;
        while(i<n)
        {
             cg+=gas[i]-cost[i];

             if(cg<0)
             {
                indx=i+1;
                cg=0;
             }
             
             i++;
             
        }
        

        return indx;
    }
}