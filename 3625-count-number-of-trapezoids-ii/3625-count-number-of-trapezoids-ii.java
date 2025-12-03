class Solution {
    public int countTrapezoids(int[][] points) {
        Map<Double,List<Double>>map1=new HashMap<>();
        Map<Integer,List<Double>>map2=new HashMap<>();
        
        double INF=1e9+7;
        int result=0;
        for(int i=0;i<points.length;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                int x1=points[i][0];
                int y1=points[i][1];
                int x2=points[j][0];
                int y2=points[j][1];

                int dx=(x1-x2);
                int dy=(y1-y2);

                double slop;
                double intercept;

                if(x1==x2)
                {
                   slop=INF;
                   intercept=x1;
                }
                else
                {
                    slop=1.0*(y2-y1)/(x2-x1);
                    intercept=1.0*(y1*dx-dy*x1)/dx;
                }
                
                if(slop==-0.0)slop=0.0;
                if(intercept==-0.0)intercept=0.0;
                map1.computeIfAbsent(slop,k->new ArrayList<>()).add(intercept);
                int mid=(x1+x2)*10000+(y1+y2);

                 map2.computeIfAbsent(mid,k->new ArrayList<>()).add(slop);
            }
        }

        for(List<Double> interceptlist:map1.values())
        {
            if(interceptlist.size()<=1)
            continue;

            TreeMap<Double,Integer>freq=new TreeMap<>();
            for(double b:interceptlist)
            {
                freq.put(b,freq.getOrDefault(b,0)+1);
            }

            int prefix=0;

            for(int count : freq.values())
            {
                result+=prefix*count;
                prefix+=count;
            }
        }

         for(List<Double> sloplist:map2.values())
        {
            if(sloplist.size()<=1)
            continue;

            TreeMap<Double,Integer>freq=new TreeMap<>();
            for(double b:sloplist)
            {
                freq.put(b,freq.getOrDefault(b,0)+1);
            }

            int prefix=0;

            for(int count : freq.values())
            {
                result-=prefix*count;
                prefix+=count;
            }
        }

        return result;
    }
}