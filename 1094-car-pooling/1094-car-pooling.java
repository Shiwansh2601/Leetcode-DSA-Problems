class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr=new int[1002];
        for(int i=0;i<trips.length;i++)
        {
            int from=trips[i][1]+1;
            int to=trips[i][2]+1;
            int x=trips[i][0];

            arr[from]+=x;
            arr[to]-=x;

        }

        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i]+arr[i-1];
            if(arr[i]>capacity)return false;
        }


        return true;
    }
}