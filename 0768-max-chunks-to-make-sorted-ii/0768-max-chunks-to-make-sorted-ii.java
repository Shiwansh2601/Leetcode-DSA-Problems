class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count=1;

        int n=arr.length;
        int[] pre=new int[n];
        int[] suf=new int[n];
        pre[0]=arr[0];
        suf[n-1]=arr[n-1];

        for(int i=1;i<n;i++)
        {
            int j=n-i-1;

            pre[i]=Math.max(arr[i],pre[i-1]);
            suf[j]=Math.min(arr[j],suf[j+1]);
        }

        for(int i=0;i<n-1;i++)
        {
            if(pre[i]<=suf[i+1])
            count++;
        }

        return count;

    }
}