// GFG : Floor in sorted array
// Easy

class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        for(int i=n-1; i>-1 ; i--){
            if(arr[i]<=x) return i;
        }
        return -1;
    }
}