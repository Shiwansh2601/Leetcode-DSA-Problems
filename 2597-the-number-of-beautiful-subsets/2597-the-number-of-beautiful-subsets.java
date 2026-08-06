class Solution {
    int count = 0;

    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> freq = new HashMap<>();
        solve(0, nums, k, freq);
        return count;

    }

    public void solve(int i, int[] nums, int k, HashMap<Integer, Integer> freq) {
        if (i == nums.length) {
            if (freq.size() > 0)
                count++;

            return;
        }
        
        int x=nums[i];
        int comp = x - k;
        if (!freq.containsKey(comp)) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            solve(i + 1, nums, k, freq);

            freq.put(x, freq.get(x) - 1);

            if (freq.get(x) == 0)
                freq.remove(x);
        }

        solve(i + 1, nums, k, freq);
    }
}