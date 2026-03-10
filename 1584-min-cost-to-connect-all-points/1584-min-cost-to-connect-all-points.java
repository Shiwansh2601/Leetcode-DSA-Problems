class Solution {
    public int minCostConnectPoints(int[][] points) {
        List<int[]>graph=new ArrayList<>();
        for(int i=0;i<points.length;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                int x1=points[i][0];
                int y1=points[i][1];

                int x2=points[j][0];
                int y2=points[j][1];

                int wt=Math.abs(x1-x2)+Math.abs(y1-y2);
                graph.add(new int[]{i,j,wt});
            }
        }

        Collections.sort(graph,(a,b)->a[2]-b[2]);
        int V=points.length;

         int[] par=new int[V];
        for(int i=0;i<V;i++)
        par[i]=i;
        
        int[] rank=new int[V];
        Arrays.fill(rank,0);

         int cost=0;
        
        for(int i=0;i<graph.size();i++)
        {
            int u=graph.get(i)[0];
            int v=graph.get(i)[1];
            
            int pu=find(par,u);
            int pv=find(par,v);
            
            if(pu!=pv)
            {
                cost+=graph.get(i)[2];
                union(par,rank,u,v);
            }
        }
        
        return cost;
        
    }

     static int find(int[] par,int x)
    {
        if(x==par[x])
        return x;
        
        return par[x]=find(par,par[x]);
    }
    
   static  void union(int[] par,int[] rank,int x,int y)
    {
        int px=find(par,x);
        int py=find(par,y);
        
        if(px==py)
        return;
        
        if(rank[px]>rank[py])
        par[py]=px;
        else if(rank[px]<rank[py])
        par[px]=py;
        else
        {
            par[px]=py;
            rank[py]+=1;
        }
        
    }
}