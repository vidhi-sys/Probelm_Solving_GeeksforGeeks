class Solution {
     static boolean isSortedHelper(int arr[], int n){
        
        // Base Case
        if (n == 1 || n == 0)
            return true;
            
        // Check if current and previous elements are in order
        // and recursively check the rest of the array
        return arr[n - 1] >= arr[n - 2] && isSortedHelper(arr, n - 1);
    }
    public boolean isSorted(int[] arr) {
        return isSortedHelper(arr, arr.length);
        }
        
    
}