// 628. Maximum product of three numbers
// Easy

// TimeComplexity : O(nlogn)
// SapceComplexity : O(1)

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int m1 = nums[n-1]*nums[n-2]*nums[n-3];
        int m2 = nums[0]*nums[1]*nums[n-1];

        return m1>m2 ? m1:m2;
    }
}