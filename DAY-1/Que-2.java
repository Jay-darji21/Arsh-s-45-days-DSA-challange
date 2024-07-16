// 284. Move Zeros
// Easy

// TimeComplexity : O(n)
// SpaceComplexity : O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n<=1){
            return;
        }

        int i=0 , j=1;

        while(j<n){
        // condition 1 : when nums[i]=0 and nums[j]!=0
        if(nums[i]==0 && nums[j]!=0){
            // swap
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        // condition 2 : when both are zeros
        else if(nums[i]==0 && nums[j]==0){
            j++;
        }
        else{
            i++;
            j++;
        }

        }
        
    }
}
