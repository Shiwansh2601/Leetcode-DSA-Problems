class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int res = -1;

        if(nums.length==1)
            return nums[0];

        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid]>nums[nums.length-1]){
                low = mid+1;
            }
            else {
                res = nums[mid];
                high = mid - 1;
            }
        }

        return res;
    }
}