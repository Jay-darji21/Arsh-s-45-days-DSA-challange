// 28. Find the index of first occurence in the String
// Easy

// TimeComplexity : O(1)
// SpaceComplexity : O(1)

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }   
        return -1;
    }
}