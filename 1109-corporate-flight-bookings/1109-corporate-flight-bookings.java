class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr=new int[n];

        for(int i=0;i<bookings.length;i++)
        {
           
            arr[bookings[i][0]-1]+=bookings[i][2];
           
            if(bookings[i][1]==n)
            continue;

            arr[bookings[i][1]]-=bookings[i][2];


        }

       
       for(int i=1;i<n;i++)
       {
          arr[i]=arr[i]+arr[i-1];
       }

       return arr;
    }
}