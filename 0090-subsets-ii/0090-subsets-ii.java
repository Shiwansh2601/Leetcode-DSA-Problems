class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public void find(int[] arr,List<Integer>ans,int i)
    {
        if(i==arr.length)
        {
            if(!res.contains(ans))
            res.add(new ArrayList<>(ans));

            return;
        }

        ans.add(arr[i]);
        find(arr,ans,i+1);
        ans.remove(ans.size()-1);
        find(arr,ans,i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer>ans=new ArrayList<>();
        find(nums,ans,0);

        return res;
    }
}