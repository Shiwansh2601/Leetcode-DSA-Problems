class Solution {
    List<String> ans = new ArrayList<>();
    HashMap<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        solve(0, digits, new StringBuilder());
        return ans;

    }

    public void solve(int i, String d, StringBuilder str) {
        if (str.length() == d.length()) {
            ans.add(str.toString());
            return;
        }

        char ch = d.charAt(i);
        String word = map.get(ch);

        for (int j = 0; j < word.length(); j++) {
            char c = word.charAt(j);
            str.append(c);
            solve(i + 1, d, str);
            str.deleteCharAt(str.length() - 1);
        }

    }

}