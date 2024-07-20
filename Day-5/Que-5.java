// 20. Valid parenthisis
// Easy

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){

            // Store the open brackets in Stack
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
                continue;
            }

            if(st.empty()) return false;

            char top = st.pop();
            if(top == '(' && c != ')'){
                return false;
            }
            else if(top == '[' && c != ']'){
                return false;
            }
            else if(top == '{' && c != '}'){
                return false;
            }

        }

        return st.isEmpty();
    }
}