class Solution {
    HashSet<String> set = new HashSet<>();

    public void solve(StringBuilder ans, String s, boolean[] used) {
        for (int i = 0; i < s.length(); i++) {
            if (used[i]) continue;
            used[i] = true;
            ans.append(s.charAt(i));
            set.add(ans.toString());
            solve(ans, s, used);
            ans.deleteCharAt(ans.length() - 1);
            used[i] = false;
        }
    }

    public int numTilePossibilities(String tiles) {
        StringBuilder ans = new StringBuilder();
        boolean[] used = new boolean[tiles.length()];
        solve(ans, tiles, used);
        return set.size();
    }
}