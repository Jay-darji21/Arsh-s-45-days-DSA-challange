// 15. 3sum
// Medium

// TimeComplexity : O(n^2)
// SpaceComplexity : O(n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);    // sorted array for sorted two sum
        // a+b+c=0 : b+c=0-a
        for(int i=0 ; i<nums.length ; i++){   // fix variable a and search for b and c
            // check for duplicate a.    // this mistake I have done before
            if(i==0 || nums[i-1]!=nums[i])
            // twoSum sorted method
             twoSum(i+1,nums.length-1,nums,0-nums[i]);
             // i+1 = b , nums.length-1 = c , 0-nums[i] = target
        }
        // Globle variable res
        return res;
    }

    // twoSum method for sorted Array
    public void twoSum(int i, int j , int[] nums , int target){

    // store a value of variable a     
    int a = nums[i-1];

    while(i<j){
        if(nums[i]+nums[j]<target) {
            i++;   // if target is lesser then move index i, for traverse the bigger value
        }
        else if(nums[i]+nums[j]>target){
            j--;   // traverse j to get lesser value
        }
        else{
            // Add the triplet to the result list
            List<Integer> temp = new ArrayList<>();
            temp.add(a);
            temp.add(nums[i]);
            temp.add(nums[j]);
            res.add(temp);

            // Skip duplicates
            while(i<j && nums[i]==nums[i+1]) i++;
            while(i<j && nums[j]==nums[j-1]) j--;

            // Move pointers
            i++;
            j--;
        }
    }
}

}