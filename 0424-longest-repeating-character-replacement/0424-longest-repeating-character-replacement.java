class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;

        int i = 0;
        int j = 0;

        int maxfreq = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxfreq = Math.max(maxfreq, map.get(ch));

            while (j - i + 1 - maxfreq > k) {
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0) - 1);

                if (map.get(c) == 0)
                    map.remove(c);

                i++;

            }

            ans = Math.max(ans, j - i + 1);

            j++;
        }

        return ans;
    }
}