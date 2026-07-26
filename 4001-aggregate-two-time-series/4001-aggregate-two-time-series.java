class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        
        List<List<Integer>>ans=new ArrayList<>();
        int i=0;
        int j=0;
        int n=series1.length;
        int m=series2.length;
        while(i<n && j<m)
        {
            List<Integer>pair=new ArrayList<>();
            if(series1[i][0] == series2[j][0])
            {
                pair.add(series1[i][0]);
                pair.add(series1[i][1]+series2[j][1]);
                i++;
                j++;
            }
            else if(series1[i][0]< series2[j][0])
            {
                pair.add(series1[i][0]);
                pair.add(series1[i][1]+series2[j][1]);
                i++;
            }
            else
            {
                pair.add(series2[j][0]);
                pair.add(series1[i][1]+series2[j][1]);
                j++;
            }

            ans.add(pair);
        }


        while(i<n)
        {
            List<Integer>pair=new ArrayList<>();
           
            pair.add(series1[i][0]);
            pair.add(series1[i][1]);
            i++;
            
            ans.add(pair);
        }

        while(j<m)
        {
            List<Integer>pair=new ArrayList<>();
           
            pair.add(series2[j][0]);
            pair.add(series2[j][1]);
            j++;
            
            ans.add(pair);
        }


        return ans;
    }
}