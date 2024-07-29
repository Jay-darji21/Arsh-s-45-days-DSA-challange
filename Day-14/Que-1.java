// GFG : Evaluate the post fix expression

// TimeComplexity : O(n)
// SpaceComplexity : O(n)


import java.util.Stack;

class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here 
        Stack<Integer> st = new Stack<>();
        for(char ch : S.toCharArray()){
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int b = st.peek();
                st.pop();
                int a = st.peek();
                st.pop();
                int res = operate(a,b,ch);
                st.push(res);
            }else{
                st.push(ch-48);
            }
        }
        return st.pop();
    }
    
    static int operate(int a,int b, char ch){
        if(ch=='+'){
            return a+b;
        }
        if(ch=='-'){
            return a-b;
        }
        if(ch=='*'){
            return a*b;
        }
        if(ch=='/'){
            return a/b;
        }else{
            return 0;
        }
    }
}