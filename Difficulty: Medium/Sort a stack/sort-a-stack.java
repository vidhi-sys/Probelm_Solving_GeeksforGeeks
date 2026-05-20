class Solution {
    void  sort_inser(Stack<Integer> st,int num){
        if(st.isEmpty()||(!st.isEmpty())&&st.peek()<num){
            st.push(num);
            return;
        }
        int n=st.peek();
        st.pop();
        sort_inser(st,num);
        st.push(n);
        
        
    }
    public void sortStack(Stack<Integer> st) {
       if(st.isEmpty()){
           return;
       }
       int num=st.peek();
       st.pop();
       sortStack(st);
      sort_inser(st,num);
        
    }
}