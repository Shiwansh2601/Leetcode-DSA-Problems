class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> validStrings(int n) {

        backtrack(n, new StringBuilder());
        return ans;
    }

    public void backtrack(int n, StringBuilder str) {
        if (str.length() == n) {
            ans.add(str.toString());
            return;
        }

        if (str.length() == 0 || str.charAt(str.length() - 1) != '0') {
            str.append('0');
            backtrack(n, str);
            str.deleteCharAt(str.length() - 1);
        }

        str.append('1');
        backtrack(n, str);
        str.deleteCharAt(str.length() - 1);

    }
}