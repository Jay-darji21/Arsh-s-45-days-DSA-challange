// 12. Integer to Roman

// TimeComplexity : O(n)
// SpaceComplexity : O(1)

class Solution {
    public String intToRoman(int num) {
        int values[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String romman[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder ans = new StringBuilder();
        int i=0;

        while(num>0){
            if(num>=values[i]){
                ans.append(romman[i]);
                num -= values[i];
            }
            else{
                i++;
            }
        }
        return ans.toString();
        
    }
}