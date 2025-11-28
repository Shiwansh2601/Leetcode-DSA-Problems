import java.util.*;

class Solution {
    private int rangeSum(int[] prefix, int L, int R) {
        if (L > R) return 0;
        if (L <= 0) return prefix[R];
        return prefix[R] - prefix[L - 1];
    }

    public int findr(int[] prefix, int indx, int k) {
        int maxPos = prefix.length - 1;
        long L = indx;
        long R = (long)indx + k;
        if (L > maxPos) return 0;
        int l = (int)Math.max(0, L);
        int r = (int)Math.min(maxPos, R);
        return rangeSum(prefix, l, r);
    }

    public int findl(int[] prefix, int indx, int k) {
        int maxPos = prefix.length - 1;
        long L = (long)indx - k;
        long R = indx;
        if (R < 0) return 0;
        int l = (int)Math.max(0, L);
        int r = (int)Math.min(maxPos, R);
        return rangeSum(prefix, l, r);
    }

    public int findlr(int[] prefix, int indx, int k) {
        int maxPos = prefix.length - 1;
        int best = 0;
        for (int x = 0; x <= k; x++) {
            long L = (long)indx - x;
            long R = (long)indx + k - 2L * x;
            if (R < L) continue;
            int l = (int)Math.max(0, L);
            int r = (int)Math.min(maxPos, R);
            if (l > r) continue;
            best = Math.max(best, rangeSum(prefix, l, r));
        }
        return best;
    }

    public int findrl(int[] prefix, int indx, int k) {
        int maxPos = prefix.length - 1;
        int best = 0;
        for (int x = 0; x <= k; x++) {
            long R = (long)indx + x;
            long L = (long)indx - (k - 2L * x);
            if (L > R) continue;
            int l = (int)Math.max(0, L);
            int r = (int)Math.min(maxPos, R);
            if (l > r) continue;
            best = Math.max(best, rangeSum(prefix, l, r));
        }
        return best;
    }

    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int maxPos = fruits[n - 1][0];
        int[] prefix = new int[maxPos + 1];
        Arrays.fill(prefix, 0);
        for (int i = 0; i < n; i++) prefix[fruits[i][0]] += fruits[i][1];
        for (int i = 1; i <= maxPos; i++) prefix[i] += prefix[i - 1];
        int m1 = findl(prefix, startPos, k);
        int m2 = findr(prefix, startPos, k);
        int m3 = findlr(prefix, startPos, k);
        int m4 = findrl(prefix, startPos, k);
        return Math.max(Math.max(m1, m2), Math.max(m3, m4));
    }
}
