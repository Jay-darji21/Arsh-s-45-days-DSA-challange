// GFG : Mimimum swaps to sort

import java.util.Arrays;
import java.util.HashMap;

class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int count = 0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        
        for(int i=0; i<n ; i++){
            if(i==map.get(nums[i])) 
                continue;
            else{
                count++;
                swap(nums,i,map.get(nums[i]));
                i--;
            }
        }
        return count;
    }
    
    public void swap(int[] arr,int x,int y){
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }
    
}