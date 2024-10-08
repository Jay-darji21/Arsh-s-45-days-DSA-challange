// 974. Subarray sums divisable by k
// Medium

// TimeComplexity : O(n)
// SpaceComplexity : O(n)

import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum=0, ans = 0 , n = nums.length;

        for(int i=0 ; i<n ; i++){
            sum = (sum+nums[i])%k;

            if(sum<0) sum+=k;

            ans += map.getOrDefault(sum,0);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}