class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        boolean[] vis=new boolean[numCourses];
        boolean[] st=new boolean[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(!vis[i])
            {
                if(dfs(graph,vis,st,i))
                return false;
            }
        }
       return true;
    }

    public boolean dfs(ArrayList<ArrayList<Integer>>graph,boolean[] vis,boolean[] st,int curr){
        vis[curr]=true;
        st[curr]=true;

        for(int i=0;i<graph.get(curr).size();i++)
        {
            int x=graph.get(curr).get(i);

            if(st[x])
            return true;

            else if(!vis[x])
            {
                if(dfs(graph,vis,st,x))
                return true;
            }
        }

        return st[curr]=false;
    }
}