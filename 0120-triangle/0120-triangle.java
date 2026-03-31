class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>>dp=new ArrayList<>(triangle);
        int n=triangle.size();
        
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                dp.get(i).set(j,triangle.get(i).get(j)+Math.min(dp.get(i+1).get(j),dp.get(i+1).get(j+1)));
            }
        }

        return dp.get(0).get(0);
    }

    
}