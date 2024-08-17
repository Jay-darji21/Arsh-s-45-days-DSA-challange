// 624. maximum distance in arrays
// medium

import java.util.List;

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int small = arrays.get(0).get(0);
        int big = arrays.get(0).get(arrays.get(0).size()-1);
        int max = 0;

        for(int i=1; i<arrays.size(); i++){
            max = Math.max(max,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-small));
            max = Math.max(max,Math.abs(big-arrays.get(i).get(0)));
            small = Math.min(small,arrays.get(i).get(0));
            big = Math.max(big,arrays.get(i).get(arrays.get(i).size()-1));
        }

        return max;
    }
}