// 54. Spiral matrix
// medium

// TimeComplexity : O(n^2)
// SpaceComplexity : O(n)

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowBegin = 0 , rowEnd = matrix.length-1 , colBegin = 0 , colEnd = matrix[0].length-1;

        while(rowBegin<=rowEnd && colBegin<=colEnd){
            // traverse the right
            for(int j=rowBegin ; j<=colEnd ; j++){
                result.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            // traverse the down
            for(int i=rowBegin ; i<=rowEnd ; i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            // traverse the left
            if(rowBegin<=rowEnd){
                for(int j=colEnd ; j>=colBegin ; j--){
                    result.add(matrix[rowEnd][j]);
                }
              rowEnd--;
            }
           

            // Traverse the up
            if(colBegin<=colEnd){
                for(int i=rowEnd ; i>=rowBegin ; i--){
                    result.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }


        return result;
    }
}