// 151. Reverse words in String
// Medium

// TimeComplexity : O(n)
// SpaceComplexity : O(n)

class Solution {
    public String reverseWords(String s) {
        // s.trim() will remove the space from first and last of the String
        // \\s+ method is divide the String with whitespace
        String[] str = s.trim().split("\\s+");

        String ans="";

        for(int i=str.length-1 ; i>0 ; i--){
            ans += str[i]+" ";
        }

        return ans+str[0];
    }
}