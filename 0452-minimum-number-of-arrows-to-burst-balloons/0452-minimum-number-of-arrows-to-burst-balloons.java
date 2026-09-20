class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> {

            if(a[0]==b[0])return Integer.compare(a[1],b[1]);

            return Integer.compare(a[0],b[0]);
        });

        int n=points.length;

        int count=0;
        long s=Long.MIN_VALUE;
        long e=s;
        for(int i=0;i<n;i++)
        {   
            if(points[i][0]<=e)
            {  
                
                s=points[i][0];

                if(points[i][1]<e)
                e=points[i][1];
                
            }
            else
            {
                count++;
                s=points[i][0];
                e=points[i][1];
            }
        }

        return count;
    }
}