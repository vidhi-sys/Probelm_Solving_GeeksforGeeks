class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
    int n = s.size();;
        int count=0;
        Stack<Integer>tempStack=new Stack<>();
        while(count<n/2){
            
            tempStack.push(s.pop());
            count++;
        }
        s.pop();
         while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
        
    }
}