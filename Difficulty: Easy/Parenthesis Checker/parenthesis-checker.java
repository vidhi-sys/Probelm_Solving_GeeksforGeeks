class Solution {
    public boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                // Push opening brackets
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                // Check if stack is empty (closing bracket without opening)
                if (st.isEmpty()) {
                    return false;
                }
                
                char top = st.pop();
                
                // Check if closing bracket matches the opening bracket
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // Stack should be empty if all brackets are balanced
        return st.isEmpty();
    }
}