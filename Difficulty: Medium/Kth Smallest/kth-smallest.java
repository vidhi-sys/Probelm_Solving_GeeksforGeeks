class Solution {
    public int kthSmallest(int[] arr, int k) {
    //possible via both max and min heap   
     PriorityQueue<Integer> minHeap = new PriorityQueue<>();
     for(int ele:arr){
         minHeap.add(ele);
     }
     for(int i=0;i<k-1;i++){
          minHeap.remove();
         
     }
     return ( minHeap.peek());
    }
}
