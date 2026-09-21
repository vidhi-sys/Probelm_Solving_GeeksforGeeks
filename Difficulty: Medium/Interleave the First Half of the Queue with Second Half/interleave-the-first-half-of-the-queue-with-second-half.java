class Solution {
    public void rearrangeQueue(Queue<Integer> q) {

        int n = q.size();
        Queue<Integer> extra = new LinkedList<>();

        // Store first half
        for(int i = 0; i < n/2; i++) {
            extra.add(q.poll());
        }

        // Interleave
        while(!extra.isEmpty()) {
            q.add(extra.poll());  // first half element
            q.add(q.poll());      // second half element
        }
    }
}