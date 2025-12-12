class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int i=0;
        int j=0;
        long sum=0L;
       
        while(j<k)
        {
            sum+=(long)arr[j++];

        }

        if((sum/k)>=threshold)
        count++;

        

        while(j<arr.length)
        {
            sum+=(long)arr[j];
            sum-=(long)arr[i];
             
            if((sum/k)>=threshold)
             count++;

             j++;
             i++;
            

        }

        return count;
    }
}