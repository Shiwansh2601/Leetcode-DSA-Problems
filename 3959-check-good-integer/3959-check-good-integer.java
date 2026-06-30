class Solution {
    public boolean checkGoodInteger(int n) {
        int sqsum=0;
        int digitsum=0;

        while(n>0)
        {
            int d=n%10;
            sqsum+=(d*d);
            digitsum+=d;

            n/=10;

        }


        return sqsum-digitsum>=50;
    }
}