class Solution {
    static int[][]dp;
    public int profit(int i,int W, int val[], int wt[]){
        if(i>=val.length) return 0;
        if(dp[i][W]!=-1){
            return dp[i][W];
        }
        int skip=profit(i+1,W,val,wt);
        
        if(wt[i]>W){
            return dp[i][W]=skip;
        }
        int pick=val[i]+profit(i+1,W-wt[i],val,wt);
        return dp[i][W]=Math.max(skip,pick);
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        dp=new int[val.length][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return profit(0,W,val,wt);
    }
}
