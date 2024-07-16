// GFG : Chocolate Distribution problem

// TimeComplexity : O(n*logn)
// SpaceComplexity : O(1)

import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // Sort the integer
        Collections.sort(a);
        
        // Initilize the diff
        long diff = a.get(m-1)-a.get(0);
        
        // Get the minimum difference in subarray
        for(int i=1 ; i<=n-m ; i++){
            long curr = a.get(i+m-1)-a.get(i);
            
            diff = Math.min(diff, curr);
        }
        
        return diff;
    }
} 
