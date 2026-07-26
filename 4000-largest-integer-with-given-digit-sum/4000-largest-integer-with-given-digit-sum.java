class Solution {
    public int largestInteger(int n, int s) {
        
        if(s>9*n)return -1;

        if(s==0)return 0;

        int num=0;
        while(n>0)
        {   
            int d=0;
            if(9<=s)
            d=9;
            else if(8<=s)
            d=8;
            else if(7<=s)
            d=7;
            else if(6<=s)
            d=6;
            else if(5<=s)
            d=5;
            else if(4<=s)
            d=4;
            else if(3<=s)
            d=3;
            else if(2<=s)
            d=2;
            else if(1<=s)
            d=1;

            num=num*10+d;

            s-=d;

            n--;

        }

        return num;
    }
}