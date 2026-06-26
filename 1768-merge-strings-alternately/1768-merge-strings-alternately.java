class Solution {
    public String mergeAlternately(String word1, String word2) {

        boolean check = true;
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            if (check) {
                ans.append(word1.charAt(i));
                check = false;
                i++;
            } else {
                ans.append(word2.charAt(j));
                check = true;
                j++;
            }
        }

        while (i < word1.length()) {

            ans.append(word1.charAt(i));
            i++;

        }
        
        while (j < word2.length()) {

            ans.append(word2.charAt(j));
            j++;

        }


        return ans.toString();

    }
}