class Solution {
    public int mySqrt(int x) {

        if(x==0 || x==1)
        return x;
        int low=0;
        int high=x;
        int mid=1;
        int ans=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            long sq=(long)mid*mid;
            if(sq==x)
            return mid;
            else if(sq>x)
            high=mid-1;
            else
            {  
                ans=mid;
               low=mid+1;
            }
        }
        return ans;
    }
}