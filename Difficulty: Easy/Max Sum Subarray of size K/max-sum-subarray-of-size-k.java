class Solution {
    public int maxSubarraySum(int[] arr, int k) {

        int windowSum = 0;

        // Step 1: Find the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum - arr[i - k] + arr[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}