class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans=-1;
      if(arr[0]>arr[1])
      return 0;
      if(arr[arr.length-1]>arr[arr.length-2])
      return arr.length-1;

      int l=1;
        int h=arr.length-2;
       while(l<=h)
       {
            int mid=(l+h)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                ans=mid;
                break;
            }

            else if(arr[mid]>arr[mid-1])
            l=mid+1;
            else
            h=mid-1;
       }

       return ans;
    }
}