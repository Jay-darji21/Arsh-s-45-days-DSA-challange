// 462. Minimum moves to equal array element II
// Medium

import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int mid = nums[nums.length/2];
        int count = 0;

        for(int num : nums){
            count += Math.abs(mid-num);
        }

        return count;
    }
}