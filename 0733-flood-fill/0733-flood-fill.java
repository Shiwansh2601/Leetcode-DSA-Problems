class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int n=image.length;
        int m=image[0].length;

        int original=image[sr][sc];

        if(original==color) return image;
       
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{sr,sc});
        image[sr][sc]=color;


        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        while(q.size()>0)
        {
            int[] temp=q.remove();
            int i=temp[0];
            int j=temp[1];

            for(int k=0;k<4;k++)
            {
                int ni=i+dr[k];
                int nj=j+dc[k];

                if(ni>=0 && nj>=0 && ni<n && nj<m && original==image[ni][nj]){
                    
                    image[ni][nj]=color;
                    q.add(new int[]{ni,nj});

                }
            }


        }

        return image;
    }
}