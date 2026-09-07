class Solution {
    public int derangeCount(int n) {
        // code here
        // Create a DP array to store results
         if(n==1){
                    return 0;
                }
              int[] dp = new int[n + 1];

              // Base cases
              dp[1] = 0;
              dp[2] = 1;
               
              // Fill the DP array using the recursive relation
              if(n>2){
              for (int i = 3; i <= n; i++) {
                  dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]);
              }
              }

              return dp[n];
        
    }
};