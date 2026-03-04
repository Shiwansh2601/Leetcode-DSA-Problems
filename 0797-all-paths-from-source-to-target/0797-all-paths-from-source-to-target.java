class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        List<Integer>list=new ArrayList<>();
        list.add(0);
        boolean[] vis=new boolean[n];
        dfs(graph,list,vis,0,n-1);
        return ans;

    }

    public void dfs(int[][]graph,List<Integer>list,boolean[] vis,int curr,int dest){
        if(curr==dest)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<graph[curr].length;i++)
        {
             int x=graph[curr][i];
             if(vis[x]==false)
             {
                vis[x]=true;
                list.add(x);
                dfs(graph,list,vis,x,dest);
                vis[x]=false;
                list.remove(list.size()-1);
             }
        }
    }
}