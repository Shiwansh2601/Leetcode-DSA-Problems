class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        HashMap<Integer,int[]>mapx=new HashMap<>();
         HashMap<Integer,int[]>mapy=new HashMap<>();
        for(int i=0;i<buildings.length;i++)
        {
            int x=buildings[i][0];
            int y=buildings[i][1];
            if(mapx.containsKey(x))
            {
                int min=Math.min(y,mapx.get(x)[0]);
                int max=Math.max(y,mapx.get(x)[1]);
                mapx.put(x,new int[]{min,max});
            }
            else
            {
                int min=Math.min(y,Integer.MAX_VALUE);
                int max=Math.max(y,Integer.MIN_VALUE);
                mapx.put(x,new int[]{min,max});
            }


             if(mapy.containsKey(y))
            {
                int min=Math.min(x,mapy.get(y)[0]);
                int max=Math.max(x,mapy.get(y)[1]);
                mapy.put(y,new int[]{min,max});
            }
            else
            {
                int min=Math.min(x,Integer.MAX_VALUE);
                int max=Math.max(x,Integer.MIN_VALUE);
                mapy.put(y,new int[]{min,max});
            }

        }

        int count=0;
        for(int i=0;i<buildings.length;i++)
        {
            int x=buildings[i][0];
            int y=buildings[i][1];

            if((y<mapx.get(x)[1]) && (y>mapx.get(x)[0]))
            {
                if((x<mapy.get(y)[1]) && (x>mapy.get(y)[0]))
                count++;
            }
        }

        return count;
    }
}