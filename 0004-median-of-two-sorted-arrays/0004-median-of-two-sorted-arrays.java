class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1=0;
        int s2=0;
        int indx=0;
        int[] res=new int[nums1.length+nums2.length];
        while(s1<nums1.length && s2<nums2.length)
        {
            if(nums1[s1]<=nums2[s2])
            {
                res[indx]=nums1[s1];
                indx++;
                s1++;
            }
            else
            {
                res[indx]=nums2[s2];
                indx++;
                s2++;
            }
        }
        while(s1<nums1.length)
        {
                res[indx]=nums1[s1];
                indx++;
                s1++;
        }

         while(s2<nums2.length)
        {
                res[indx]=nums2[s2];
                indx++;
                s2++;
        }
       double output;
        if(res.length%2==0)
        {
            output=(res[res.length/2-1]+res[res.length/2])/2.0;
        }
        else
        {
            output=res[res.length/2];
        }

        return output;
    }
}