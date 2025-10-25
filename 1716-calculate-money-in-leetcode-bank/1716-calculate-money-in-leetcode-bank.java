class Solution {
    public int totalMoney(int n) {
        int no=n/7;
        int total=0;
        for(int i=0;i<=no;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(n==0)
                return total;

                total=total+(j+i);
                n--;
            }
        }

        return total;
    }
}