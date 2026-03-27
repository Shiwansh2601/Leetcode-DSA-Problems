class Solution {
    
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
       

       if(n==1)
       return new int[]{0};
       
       ArrayList<ArrayList<Integer>>tree=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        tree.add(new ArrayList<>());

       }

       for(int i=0;i<n-1;i++)
       {
        int a=edges[i][0];
        int b=edges[i][1];
        tree.get(a).add(b);
        tree.get(b).add(a);

       }
        int[] res= new int[n];
        int[] count=new int[n];
        int[] ans={0};
        counting(0,0,-1,tree,count,ans);
        res[0]=ans[0];
        dfs(0,-1,count,res,n,tree);
        return res;

    }
   
   public static void dfs(int curr,int par,int[] count,int[] res,int n,ArrayList<ArrayList<Integer>>tree)
   {

     if(par!=-1)
      res[curr]=res[par]-count[curr]+(n-count[curr]);

      for(int nx:tree.get(curr))
      {
          if(nx==par)
          continue;

          dfs(nx,curr,count,res,n,tree);
      }
   }

    public static void counting(int curr,int step,int par,ArrayList<ArrayList<Integer>>tree,int[] count,int[] ans)
    {
         ans[0]+=step;
         count[curr]=1;
         for(int nx:tree.get(curr))
         {
            if(nx==par)
            continue;

            counting(nx,step+1,curr,tree,count,ans);

            count[curr]+=count[nx];
         }
    }
}