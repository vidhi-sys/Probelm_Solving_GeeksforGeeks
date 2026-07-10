class Solution {
    public int findMaxSum(int arr[]) {

        int n = arr.length;

        if (n == 1)
            return arr[0];

        int prev2 = arr[0];
        int prev1 = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            int take = prev2 + arr[i];
            int notTake = prev1;

            int curr = Math.max(take, notTake);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}