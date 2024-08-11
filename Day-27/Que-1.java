// GFG : Permute two arrays such that sum of every pair is greater or equal to K
// Easy

import java.util.Arrays;

class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        reverse(arr2);
        for(int i=0; i<arr1.length ; i++){
            if(arr1[i]+arr2[i]<k){
                return false;
            }
            
        }
        return true;
    }
    private void reverse(int a[]){
        int left=0;
        int right=a.length-1;
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}