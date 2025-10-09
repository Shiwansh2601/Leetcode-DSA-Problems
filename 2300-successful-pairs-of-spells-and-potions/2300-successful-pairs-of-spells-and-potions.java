class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int count=0;
        Arrays.sort(potions);
        int[] res=new int[spells.length];
        for(int i=0;i<spells.length;i++)
        {
            count=0;
            int l=0;
            int h=potions.length-1;
            while(l<=h)
            {
                int mid=(l+h)/2;
                if(spells[i]*(long)potions[mid]>=success)
                {
                    h=mid-1;
                }
                else
                l=mid+1;
            }
            count=potions.length-l;
            res[i]=count;
        }

        return res;
    }
}