class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>>g=new ArrayList<>();

        int n=isConnected.length;

        for(int i=0;i<n;i++)
        {
            g.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1)
                {
                    g.get(i).add(j);
                    g.get(j).add(i);
                }
            }
        }
         int count=0;

         boolean[] vis=new boolean[n];

        for(int i=0;i<n;i++)
        {
           if(!vis[i])
           {
             dfs(i,g,vis);
             count++;
           }

        }

        return count;
    }

    public void dfs(int curr,ArrayList<ArrayList<Integer>>g,boolean[] vis)
    {
            vis[curr]=true;


            for(int el:g.get(curr))
            {
                if(!vis[el])
                {
                    dfs(el,g,vis);
                }
            }
    }
}