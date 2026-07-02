class Solution {
    public int findUnsortedSubarray(int[] nums) {
     int max = Integer.MIN_VALUE;
     int right = -1;
     for(int i = 0 ; i<nums.length;i++){
        if(nums[i]>max){
            max = nums[i];
        }
        if(nums[i]<max){
            right=i;
        }
     }
     if(right==-1){
        return 0;
     }
     int min = Integer.MAX_VALUE;
     int left = 0;
     for(int i = nums.length-1;i>=0;i--){
        if(nums[i]<min){
            min=nums[i];
        }
        if(nums[i]>min){
            left = i;
        }
     }
     return (right-left)+1;
    }
}