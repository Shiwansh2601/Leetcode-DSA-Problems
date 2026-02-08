class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(0,target,new ArrayList<>(),candidates);
        return res;
    }

    public void solve(int i,int target,ArrayList<Integer>list,int[] nums)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        if(i==nums.length || target<0)
        return;

        list.add(nums[i]);
        solve(i+1,target-nums[i],list,nums);

        list.remove(list.size()-1);
        while(i<nums.length-1 && nums[i]==nums[i+1])
        i++;
        solve(i+1,target,list,nums);

    }
}