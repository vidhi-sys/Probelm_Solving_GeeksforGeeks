class Solution {
    static int setKthBit(int n, int k) {
        // code here
        return((1<<k)|n);
    }
}