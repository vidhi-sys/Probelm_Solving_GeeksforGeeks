import java.util.*;

class Solution {

    public int maximizeCuts(int n, int x, int y, int z) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int ans = solve(n, x, y, z, dp);

        if (ans == -1) {
            return 0;
        }

        return ans;
    }

    int solve(int n, int x, int y, int z, int[] dp) {

        if (n == 0) {
            return 0;
        }

        if (n < 0) {
            return -1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int a = solve(n - x, x, y, z, dp);
        int b = solve(n - y, x, y, z, dp);
        int c = solve(n - z, x, y, z, dp);

        int ans = Math.max(a, Math.max(b, c));

        if (ans == -1) {
            return dp[n] = -1;
        }

        return dp[n] = ans + 1;
    }
}