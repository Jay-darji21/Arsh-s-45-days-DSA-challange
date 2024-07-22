// 227. Basic Calculator II
// Medium

// TimeComplexity : O(n)
// SpaceComplexity : O(n)

import java.util.Stack;

class Solution {
    public int calculate(String s) {
        int curr = 0;
        char operator = '+';
        Stack<Integer> stack = new Stack<>();

        for(int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                curr = curr * 10 + (ch-'0');
            }

            if(!Character.isDigit(ch) && ch != ' ' || i==s.length()-1){
                if(operator=='+'){
                    stack.push(curr);
                }
                else if(operator=='-'){
                    stack.push(-curr);
                }
                else if(operator=='*'){
                    stack.push(stack.pop()*curr);
                }
                else if(operator=='/'){
                    stack.push(stack.pop()/curr);
                }

                operator = ch;
                curr = 0;
            }
        }
        int res=0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }

        return res;
    }
}