class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=neededTime.length;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(colors.charAt(i)==colors.charAt(i-1))
            {
                sum+=neededTime[i-1];
                int max=neededTime[i-1];

                while(i<n && (colors.charAt(i)==colors.charAt(i-1)))
                {
                    sum+=neededTime[i];
                    if(neededTime[i]>max)
                    max=neededTime[i];
                    i++;
                }

                sum-=max;
            }
        }

        return sum;
    }
}