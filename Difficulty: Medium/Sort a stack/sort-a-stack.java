class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
       Stack<Integer>tempst=new Stack<>();
       int[]arr=new int[st.size()];
       int j=0;
       while(!st.isEmpty()){
           arr[j]=st.pop();
           j++;
       }
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
           st.push(arr[i]);
       }
       
        
        
    }
}