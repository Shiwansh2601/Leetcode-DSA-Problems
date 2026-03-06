class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
         List<Integer>ans=new ArrayList<>();
        boolean[] vis=new boolean[n];
        boolean[] st=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            dfs(graph,vis,st,ans,i);
        }

        
         Collections.sort(ans);
         return ans;
    }

    public boolean dfs(int[][] graph,boolean[] vis,boolean[] st,List<Integer>ans,int curr){
        vis[curr]=true;
        st[curr]=true;
        boolean check=true;
        for(int i=0;i<graph[curr].length;i++)
        {
            int x=graph[curr][i];
            if(st[x])
            return true;

            if(!vis[x])
           {
            if( dfs(graph,vis,st,ans,x))
               return true;
           }
           
        }
        ans.add(curr);
       return st[curr]=false;
        
    }

}