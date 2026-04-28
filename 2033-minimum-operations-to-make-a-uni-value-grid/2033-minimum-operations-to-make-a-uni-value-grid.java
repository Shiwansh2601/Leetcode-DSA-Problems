class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer>arr=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        int len=n*m;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr.add(grid[i][j]);
            }
        }
      
      Collections.sort(arr);
        int rem=arr.get(0)%x;
        int res=0;

        int set=arr.get(len/2);
        for(int i=0;i<len;i++)
        {
            int curr=arr.get(i);
            if(curr%x !=rem)
            return -1;
             
            res+=Math.abs(curr-set)/x;
        }

        return res;
    }
}