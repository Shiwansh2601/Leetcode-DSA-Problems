class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix[0].length-1;
        int l=0;
        

        while(l<matrix.length && r>=0)
        {

            if(matrix[l][r]==target)return true;

            if(matrix[l][r]>target)
            {
                r--;
            }
            else
            {
                l++;
            }
        }



      return false;

    }
}