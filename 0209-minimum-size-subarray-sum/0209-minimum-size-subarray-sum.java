class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        while (j < nums.length) {

            sum += nums[j];

            if (sum >= target) {
                int len = j - i + 1;
                min = Math.min(min, len);
            }
            while (sum > target) {
                sum -= nums[i++];
                 
                 if (sum >= target) {
                int len = j - i + 1;
                min = Math.min(min, len);
            }
            }
           

            j++;
        }

        if (min == Integer.MAX_VALUE)
            return 0;

        return min;
    }
}