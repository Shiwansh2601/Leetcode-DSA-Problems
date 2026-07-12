class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] copy = arr.clone();
        Arrays.sort(arr);
        HashMap<Integer,Integer>map=new HashMap<>();

        int[] ans=new int[arr.length];
        
        int p=1;
        for(int i=0;i<arr.length;i++)
        {   
            if(!map.containsKey(arr[i]))
           {
               map.put(arr[i],p);
               p++;
           }

        }

         for(int i=0;i<arr.length;i++)
        {   
            ans[i]=map.get(copy[i]);

        }

        return ans;
    }
}