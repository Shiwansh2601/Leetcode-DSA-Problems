class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            nums[i]=0;
            else
            nums[i]=1;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        int csum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            csum+=nums[i];
            int comp=csum-k;
            if( map.containsKey(comp))
            count+=map.get(comp);
            map.put(csum,map.getOrDefault(csum,0)+1);
    
        }
        return count;
    }
}