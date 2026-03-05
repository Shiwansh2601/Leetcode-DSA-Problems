class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        dfs(graph, list, 0, n - 1);
        return ans;

    }

    public void dfs(int[][] graph, List<Integer> list, int curr, int dest) {
        if (curr == dest) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < graph[curr].length; i++) {
            int x = graph[curr][i];
            list.add(x);
            dfs(graph, list, x, dest);
            list.remove(list.size() - 1);

        }
    }
}