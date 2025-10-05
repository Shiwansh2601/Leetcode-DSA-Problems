class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans=-1;
       int i=0;
       int max=arr[0];
       while(i<arr.length)
       {
            if(arr[i]>=max)
            {
                  max=arr[i];
                  i++;
            }
            else
            {
                ans=i-1;
                break;
            }
       }

       return ans;
    }
}