class Solution {
    public int trap(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;

        while (left < right) {
            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);
            if (leftmax <= rightmax) {
                res += leftmax - height[left++];
            } else {
                res += rightmax - height[right--];
            }

        }
        return res;
    }
}