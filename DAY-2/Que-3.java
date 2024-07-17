// 122. Best time to buy and sell stockes - II

// TimeComplexity : o(n)
// SpaceComplexity : O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;

        for(int i=1 ; i<n ; i++){
            if(buy < prices[i]){
                profit += prices[i]-buy;
            }
            buy = prices[i];
        }

        return profit;
    }
}