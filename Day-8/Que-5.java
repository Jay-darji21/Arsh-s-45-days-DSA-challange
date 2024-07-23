// GFG : Product Array Puzzle

// TimeComplexity : O(n^2-n)
// SpaceComplexity : O(n)


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long res[] = new long[n];
        for(int i=0 ; i<n ; i++){
            res[i] = product(i,nums);
        }
        
        return res;
	} 
	
	public static long product(int r,int nums[]){
	    long ans = 1;
	    for(int i=0 ; i<nums.length ; i++){
	        if(i==r) continue;
	        
	        ans *= nums[i];
	    }
	    
	    return ans;
	}
} 
