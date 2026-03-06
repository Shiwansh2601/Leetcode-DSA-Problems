class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
         List<Integer>ans=new ArrayList<>();
        boolean[] vis=new boolean[n];
        boolean[] st=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            dfs(graph,vis,st,i);
        }

        for(int i=0;i<n;i++)
        {
            if(!st[i])
            ans.add(i);
        }
         return ans;
    }

    public boolean dfs(int[][] graph,boolean[] vis,boolean[] st,int curr){
        vis[curr]=true;
        st[curr]=true;
        for(int i=0;i<graph[curr].length;i++)
        {
            int x=graph[curr][i];
            if(st[x])
            return true;

            if(!vis[x])
           {
            if( dfs(graph,vis,st,x))
               return true;
           }
           
        }
    
       return st[curr]=false;
        
    }

}