// 287. Find the duplicate number
// Medium


// TimeComplexity : O(n)
// SpaceComplexity : O(n)

import java.util.HashMap;

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        // Put the values in method and return if already exists
        for(int i=0 ; i<n ; i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            map.put(nums[i],1);
        }
        return -1;
    }
}