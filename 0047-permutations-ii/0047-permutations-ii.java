class Solution {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> current = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        solve(nums, used);

        return res;
    }

    void solve(int[] nums, boolean[] used) {

        if (current.size() == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Already used in current permutation
            if (used[i])
                continue;

            // Skip duplicate branches
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            used[i] = true;
            current.add(nums[i]);

            solve(nums, used);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}