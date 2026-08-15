class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            // If the current element is non-zero
            if (arr[i] != 0) {

                // Swap the current element with
                // the 0 at index 'count'
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                // Move 'count' pointer to 
                // the next position
                count++;}}
    }
}