// 14. Longest common prefix
// Easy

// TimeComplexity : O(n)
// SpaceComplexity : O(n)

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // StringBuilder for stores the naswer
        StringBuilder ans = new StringBuilder();

        // Sort the String array
        Arrays.sort(strs);

        char[] first =strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i=0 ; i<first.length; i++){
            if(first[i]!=last[i]){
                break;
            }
            ans.append(first[i]);
        }

        return ans.toString();
    }
}