class Solution {
     Map<Integer,Integer>index=new HashMap<>();
    int[] arr;
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        this.arr=arr;

        for(int i=0;i<n;i++)
        {
            index.put(arr[i],i);
        }
         
         int ans=0;
       


        for(int j=1;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                int len=solve(j,k);
                if(len>2)
                {
                    ans=Math.max(ans,len);
                }
            }
        }

        return ans;
    }

    public int solve(int j,int k)
    {
        int x= arr[k]-arr[j];

        if(index.containsKey(x) && index.get(x)<j)
        {
            int i=index.get(x);

            return solve(i,j)+1;
        }
        return 2;
    }
}