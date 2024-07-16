// 75. Sort Colors
// Medium
// Booyer-More voting algorithm

// TimeComplexity : O(n)
// SpaceComplexity : O(n)

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int p0=0 , p2=n-1 , curr=0;

        while(curr<=p2){
            // when curr = 0
            if(nums[curr]==0){
                // swap
                int temp = nums[p0];
                nums[p0] = nums[curr];
                nums[curr] = temp;
                curr++;
                p0++;
            }
            else if(nums[curr] == 2){
                // swap
                int temp = nums[p2];
                nums[p2] = nums[curr];
                nums[curr] = temp;
                p2--;
            }
            else{
                curr++;
            }
        }
    }
}