class Solution {
    static void ibot(Stack<Integer> st,int x){
        if(st.isEmpty()){
            st.push(x);
            return;
            
        }
        int top=st.pop();
        ibot(st,x);
        st.push(top);
    }
    
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        // code here
        
        int top_ele=st.pop();
        reverseStack(st);
        ibot(st,top_ele);
    }
}
