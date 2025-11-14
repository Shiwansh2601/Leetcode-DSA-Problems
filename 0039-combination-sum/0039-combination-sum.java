class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public void find(int i, int[] arr, List<Integer> pair, int sum, int k) {

        if (sum == k) {
            res.add(new ArrayList<>(pair));
            return;
        }

        if (i == arr.length || sum > k) {
            return;
        }

        pair.add(arr[i]);
        find(i, arr, pair, sum + arr[i], k);   

        pair.remove(pair.size() - 1);  // backtracking 
        find(i + 1, arr, pair, sum, k);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> pair = new ArrayList<>();
        find(0, candidates, pair, 0, target);
        return res;
    }
}
