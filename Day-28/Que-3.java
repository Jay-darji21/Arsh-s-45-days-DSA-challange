// 33. Search in rotated sorted array
// Medium

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        return binarySearch(nums,target,left,right);
    }

    public int binarySearch(int arr[],int target,int left , int right){
        // Not found
        if(left>right){
            return -1;
        }

        // Apply binary Search
        int mid = left + (right-left)/2;
        if(arr[mid]==target){
            return mid;
        }

        //If Left half is sorted
        if(arr[mid] >= arr[left]){

            // If key is in left half
            if(arr[left] <= target && target <= arr[mid]){
                return binarySearch(arr,target,left,mid-1);
            }else{
                return binarySearch(arr,target,mid+1,right);
            }
        }
        else{

            // If target is in right half
            if(arr[mid] <= target && target <= arr[right]){
                return binarySearch(arr,target,mid+1,right);
            }else{
                return binarySearch(arr,target,left,mid-1);
            }
        }
    }
}