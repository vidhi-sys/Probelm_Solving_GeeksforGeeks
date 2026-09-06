class Solution {
    public int amount(int[]arr,int i,int[]dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=arr[i]+amount(arr,i+2,dp);
        int skip=amount(arr,i+1,dp);
        return dp[i]=Math.max(take,skip);
    }
    public int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return amount(arr,0,dp);
        
        
    }
}