class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);

        int units=0;
        int rem=truckSize;

        for(int i=0;i<boxTypes.length;i++)
        {
            if(boxTypes[i][0]<=rem)
            {
                units+=(boxTypes[i][0]*boxTypes[i][1]);
                rem-=boxTypes[i][0];
            }
            else
            {
                units+=rem*boxTypes[i][1];
                break;
            }
        }

        return units;
    }
}