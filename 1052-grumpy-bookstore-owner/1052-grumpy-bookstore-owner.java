class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans=0;
        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]==0)
            {
                ans+=customers[i];
            }
        }

        int sum=0;
        int max=0;

        int i=0;
        int j=0;
        while(j<customers.length)
        {
            if(grumpy[j]==1)
            sum+=customers[j];

            if(j-i+1==minutes)
            {
                max=Math.max(max,sum);

                if(grumpy[i]==1)
                sum-=customers[i];

                i++;
            }
            j++;
        }

        return ans+max;
    }
}