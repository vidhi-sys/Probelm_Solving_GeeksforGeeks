class Solution {
    public int findMinDiff(int arr[], int m) {
        // code here
        if(arr.length==0||m==0){
            return 0;
        }
        if(m>arr.length){
            return -1;
        }
      
        Arrays.sort(arr);
       int diff=Integer.MAX_VALUE;
       for(int i=0;i+m-1<arr.length;i++){
           if((arr[i+m-1]-arr[i])<diff){
               diff=arr[i+m-1]-arr[i];
           }
           
       }
       return diff;
    }
}