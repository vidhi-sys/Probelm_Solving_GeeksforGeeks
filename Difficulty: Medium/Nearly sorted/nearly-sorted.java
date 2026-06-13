import java.util.*;

class Solution {
    public void nearlySorted(int[] arr, int k) {

        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int ele : arr) {
            pq.add(ele);

            if (pq.size() > k) {
                arr[idx++] = pq.remove();
            }
        }

        while (!pq.isEmpty()) {
            arr[idx++] = pq.remove();
        }
    }
}