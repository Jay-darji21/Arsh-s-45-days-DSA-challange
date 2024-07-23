// 168. Excelsheet column title
// Easy

// TimeComplexity : O(n)
// SpaceComplexity : O(n)

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while(columnNumber>0){
            res.insert(0,(char)(65+(columnNumber-1)%26));
            columnNumber--;
            columnNumber/=26;
        }

        return res.toString();
    }
}