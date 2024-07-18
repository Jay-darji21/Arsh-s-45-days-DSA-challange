// 1423. Maximum points you can get from the card

// TimeComplexity : O(n)
// SpaceComplexity : O(1)

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0, right = 0 , n = cardPoints.length-1;

        for(int i=0 ; i<k ; i++){
            left += cardPoints[i];
        }

        int max=0;
        max = Math.max(left,right);
        for(int i=k-1 ; i>=0 ; i--){
            left -= cardPoints[i];
            right += cardPoints[n];
            n--;

            max = Math.max(max,left+right);
        }

        return max;
    }
}