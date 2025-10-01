class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int res=0;
        int l=0;
        int n=citations.length;
        int r=n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(citations[mid]>=n-mid)
            {
                res=n-mid;
                r=mid-1;
            }
            else
            l=mid+1;

        }

        return res;
    }
}