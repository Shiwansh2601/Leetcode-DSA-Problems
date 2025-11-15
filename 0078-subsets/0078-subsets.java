class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public void findsubset(int[] arr,List<Integer>ans,int i)
    {
        if(i==arr.length)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[i]);
        findsubset(arr,ans,i+1);
        ans.remove(ans.size()-1);
        findsubset(arr,ans,i+1);


    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>ans=new ArrayList<>();
         findsubset(nums,ans,0);

         return res;
    }
}