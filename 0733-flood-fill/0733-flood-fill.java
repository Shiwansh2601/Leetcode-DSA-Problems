class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int excolor=image[sr][sc];
        int m=image.length;
        int n=image[0].length;
        boolean[][]vis=new boolean[m][n];
        dfs(image,sr,sc,excolor,color,vis);
        
        return image;
    }
     
    public void dfs(int[][] image,int i,int j,int ex,int c,boolean[][] vis)
    {
         int m=image.length;
        int n=image[0].length;
        if(i<0||j<0||i>=m||j>=n||image[i][j]!=ex||vis[i][j])
        return;

        vis[i][j]=true;
        image[i][j]=c;

        dfs(image,i+1,j,ex,c,vis);
        dfs(image,i,j+1,ex,c,vis);
        dfs(image,i-1,j,ex,c,vis);
        dfs(image,i,j-1,ex,c,vis);

    }

}