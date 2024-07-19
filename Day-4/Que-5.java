// 169. Majority element
// Easy

// TimeComplexity : O(n)
// SpaceComplexity : O(1)


class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        Integer majority = null;

        for(int num : nums){
            // Booyer - voting algorithm
            if(count==0){
                majority = num;
            }

            count+=(num==majority)?1:-1;
        }

        return majority;
    }
}