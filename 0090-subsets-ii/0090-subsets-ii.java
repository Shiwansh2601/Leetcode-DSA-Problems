class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public void find(int[] arr,List<Integer>ans,int i)
    {
        if(i==arr.length)
        {
            res.add(new ArrayList<>(ans));

            return;
        }

        ans.add(arr[i]);
        find(arr,ans,i+1);
        ans.remove(ans.size()-1);

        while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
            i++;
        }

        find(arr,ans,i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer>ans=new ArrayList<>();
        find(nums,ans,0);

        return res;
    }
}