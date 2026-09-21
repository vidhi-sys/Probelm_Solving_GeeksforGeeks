class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // 1. Store index if current element is negative
            if (arr[i] < 0) {
                q.add(i);
            }

            // 2. Window has reached size k
            if (i >= k - 1) {

                // 3. Remove elements outside current window
                while (!q.isEmpty() && q.peek() < i - k + 1) {
                    q.poll();
                }

                // 4. Get first negative
                if (q.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(arr[q.peek()]);
                }
            }
        }

        return ans;
    }
}