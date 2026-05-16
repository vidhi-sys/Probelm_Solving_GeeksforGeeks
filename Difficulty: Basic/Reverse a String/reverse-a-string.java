// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        String s_new="";
        Stack<Character>st=new Stack<>();
        char[]chars=s.toCharArray();
        for(char ch:chars){
            st.push(ch);
        }
        while(!st.isEmpty()){
        s_new+=st.pop();
            
        }
        return s_new;
    }
}