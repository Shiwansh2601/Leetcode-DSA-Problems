class Solution {

    public int maxVowels(String s, int k) {

        HashSet<Character> set = new HashSet<>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int i = 0, j = 0;
        int count = 0;
        int maxCount = 0;

        while (j < s.length()) 
        {

            if (set.contains(s.charAt(j))) {
                count++;
            }

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {

                maxCount = Math.max(maxCount, count);

                if (set.contains(s.charAt(i))) {
                    count--;
                }

                i++;
                j++;
            }
        }

        return maxCount;
    }
}