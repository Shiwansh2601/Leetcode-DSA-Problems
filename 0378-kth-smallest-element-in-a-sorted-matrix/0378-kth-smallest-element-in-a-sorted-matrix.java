class Solution {
    public int kthSmallest(int[][] matrix, int k) {
      int len=matrix.length;
      int[] res=new int[len*len];
      
     int indx=0;
      for(int i=0;i<len;i++)
      {
        for(int j=0;j<len;j++)
        {
            res[indx++]=matrix[i][j];
        }
      }
      Arrays.sort(res);
      return res[k-1];
        
    }
}