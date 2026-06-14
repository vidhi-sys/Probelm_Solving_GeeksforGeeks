class Solution {
    public static int minCost(int[] arr) {
        // code here
        int res=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
        }
        while(pq.size()>1){
            int f=pq.poll();
            int s=pq.poll();
            res+=f+s;
            pq.add(f+s);
        }
        return res;
        
    }
}