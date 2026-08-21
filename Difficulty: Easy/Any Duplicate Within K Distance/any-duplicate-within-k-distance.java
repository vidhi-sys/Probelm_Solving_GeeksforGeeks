class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            // If duplicate is already in current window
            if (set.contains(arr[i])) {
                return true;
            }

            set.add(arr[i]);

            // Keep only k previous elements
            if (i >= k) {
                set.remove(arr[i - k]);
            }
        }

        return false;
    }
}