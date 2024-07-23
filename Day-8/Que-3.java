// 48. Rotate Image
// Medium

// TimeComplexity : O(n^2)
// SpaceComplexity : O(1)

class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Transpose of matrix
        for(int i=0 ; i<m ; i++){
            for(int j=i ; j<n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Interchange the colums

        for(int i=0 ; i<m ; i++){
            int li = 0;         // left index
            int ri = n-1;       // right index

            while(li<ri){
                int temp = matrix[i][li];
                matrix[i][li] = matrix[i][ri];
                matrix[i][ri] = temp;
                li++;
                ri--;
            }
        }        
    
    }
}