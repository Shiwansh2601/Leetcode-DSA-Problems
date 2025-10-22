class Solution {
    boolean isprime(int num)
    {
        if(num==1)
        return false;

        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int max=0;
        int n=nums.length;
        int m=nums[0].length;

        int i=0;
        int j=0;
        while(i<n && j<m)
        {
            if(isprime(nums[i][j]))
            {
                max=Math.max(max,nums[i][j]);
            }
            i++;
            j++;
        }
        i=0;
        j=m-1;
         while(i<n && j>=0)
        {
            if(isprime(nums[i][j]))
            {
                max=Math.max(max,nums[i][j]);
            }
            i++;
            j--;
        }
        return max;
    }
}