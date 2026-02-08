class Solution {
    public int maximumScore(int[] nums, int k) {

        int res = Integer.MIN_VALUE;
        int i = k;
        int j = k;
        int indx = k;
        int min = nums[k];
        while (i >= 0 && j < nums.length) {

            int curr = nums[indx];
            min = Math.min(min, curr);
            res = Math.max(res, min * (j - i + 1));

            if (i == 0) {
                j++;
                indx = j;
            }

            else if (j == nums.length - 1) {
                i--;
                indx = i;
            }

            else if (i > 0 && j < nums.length - 1) {
                if (nums[i - 1] < nums[j + 1]) {
                    j++;
                    indx = j;
                } else {
                    i--;
                    indx = i;
                }
            }
        }

        return res;
    }
}