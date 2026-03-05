class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        List<Integer>list=new ArrayList<>();
        list.add(0);
        Queue<List<Integer>>q=new LinkedList<>();
        q.add(list);
        while(!q.isEmpty()){

            List<Integer>curr=q.poll();
            int node=curr.get(curr.size()-1);
            if(node==n-1)
            {
                ans.add(curr);
                continue;
            }

            for(int e:graph[node])
            {
                List<Integer>newpath=new ArrayList<>(curr);
                newpath.add(e);
                q.add(newpath);
            }
        }
        return ans;

    }

    
}