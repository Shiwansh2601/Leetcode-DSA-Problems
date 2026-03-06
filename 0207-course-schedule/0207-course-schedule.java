class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            graph.add(new ArrayList<>());
        }
        int[] indegree=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++)
        {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
       

       Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            q.add(i);
            
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(!q.isEmpty()){
            
            int curr=q.poll();
            ans.add(curr);
            for(int i=0;i<graph.get(curr).size();i++)
            {
                int x=graph.get(curr).get(i);
                indegree[x]--;
                
                if(indegree[x]==0)
                q.add(x);
            }
        }
       if(ans.size()!=numCourses)
       return false;
       else
       return true;
    }
}