import java.util.*;

class Solution {
    public static boolean checkRedundancy(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch != ')') {
                st.push(ch);
            } 
            else {

                boolean hasOperator = false;

                while (!st.isEmpty() && st.peek() != '(') {

                    char top = st.pop();

                    if (top == '+' || top == '-' || 
                        top == '*' || top == '/') {
                        hasOperator = true;
                    }
                }

                // remove '('
                st.pop();

                // no operator means redundant brackets
                if (!hasOperator) {
                    return true;
                }
            }
        }

        return false;
    }
}