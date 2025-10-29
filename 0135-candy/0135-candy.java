class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        if(n==1)
        return 1;
        
        int[] temp=new int[n];
        Arrays.fill(temp,1);
        
        for(int i=1;i<n;i++)
        {
            if(ratings[i]>ratings[i-1])
            temp[i]=temp[i-1]+1;
        }
        int sum=temp[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            temp[i]=Math.max(temp[i],temp[i+1]+1);

            sum+=temp[i];
        }
       
       return sum;

    }
}