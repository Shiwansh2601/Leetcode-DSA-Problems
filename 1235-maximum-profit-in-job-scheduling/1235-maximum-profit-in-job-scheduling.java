class Solution {

    int n;
    int[] startTime;
    int[] endTime;
    int[] profit;
    int[] dp;

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        n = startTime.length;

       
        int[][] jobs = new int[n][3];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }

        
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        this.startTime = new int[n];
        this.endTime = new int[n];
        this.profit = new int[n];

        for (int i = 0; i < n; i++) {
            this.startTime[i] = jobs[i][0];
            this.endTime[i] = jobs[i][1];
            this.profit[i] = jobs[i][2];
        }

        dp = new int[n];
        Arrays.fill(dp, -1);

        return solve(0);
    }

    int solve(int i) {

                        
        if (i == n) {
            return 0;
        }

                            
        if (dp[i] != -1) {
            return dp[i];
        }

                         
        int skip = solve(i + 1);

                      
        int next = findNextJob(i);

        int take = profit[i] + solve(next);

        return dp[i] = Math.max(take, skip);
    }

    // Find first job whose start time >= current job's end time
    int findNextJob(int i) {

        int target = endTime[i];

        int low = i + 1;
        int high = n - 1;

        int ans = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (startTime[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}