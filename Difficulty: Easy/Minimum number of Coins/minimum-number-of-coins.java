class Solution {
    public int findMin(int n) {
        int ans = 0;
        int rem = n;

        while (rem != 0) {
            if (rem >= 10) {
                rem -= 10;
            } 
            else if (rem >= 5) {
                rem -= 5;
            } 
            else if (rem >= 2) {
                rem -= 2;
            } 
            else {
                rem -= 1;
            }
            ans++;
        }
        return ans;
    }
}