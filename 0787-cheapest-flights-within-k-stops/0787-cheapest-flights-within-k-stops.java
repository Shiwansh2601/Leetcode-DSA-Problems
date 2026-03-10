class Solution {
    public static class pair{
        int dest;
        int price;

        public pair(int d,int p)
        {
            this.dest=d;
            this.price=p;

        }
    }

    static ArrayList<ArrayList<Integer>>res=new ArrayList<>();
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int m=flights.length;
        
        ArrayList<ArrayList<pair>>graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++)
        {
            graph.get(flights[i][0]).add(new pair(flights[i][1],flights[i][2]));
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        int[] beststop=new int[n];
        Arrays.fill(beststop,Integer.MAX_VALUE);
        pq.add(new int[]{src,0,0});
        while(!pq.isEmpty())
        {
            int[] arr=pq.remove();
            int u=arr[0];
            int price=arr[1];
            int stop=arr[2];

             if(stop>k+1 || stop>beststop[u])
              continue;
            
            else if(u==dst)
            {
                return price;
            }
            
            beststop[u]=stop;
            
                for(int i=0;i<graph.get(u).size();i++)
                {
                    pair p=graph.get(u).get(i);
                    pq.add(new int[]{p.dest,price+p.price,stop+1});
                }
        }
        
        return -1;
    }
    
    }
