// 11. Container with most water
// Medium

// TimeComplexity : O(n)
// SpaceComplexity : O(1)

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        while(left<right){
            // get the current area
            int currentArea = Math.min(height[left],height[right])*(right-left);
            maxArea = Math.max(maxArea , currentArea);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}