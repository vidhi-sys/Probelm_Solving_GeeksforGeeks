class Solution {
    public int findMaxAverage(List<Integer> arr, int k) {
        // code here
            int idx=0;
            int max_sum=Integer.MIN_VALUE;
            int n=arr.size();
            int sum=0;
           for(int i=0;i<k;i++){
            sum+=arr.get(i);
           }
           max_sum=Math.max(sum,max_sum);
           for(int i=k;i<n;i++){
             sum+=arr.get(i);
            sum=sum-arr.get(i-k);
            if(sum>max_sum){
            max_sum=Math.max(sum,max_sum);
            idx=i-k+1;
                
            }
            
           }
        return idx;
        
    }
}