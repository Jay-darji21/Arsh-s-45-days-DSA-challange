// 994. Rotten Oranges
// medium

// TimeComplexity : O(n*m)
// SpaceComplexity : O(n*m)

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    private class Info {
        int row;
        int col;

        Info(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int orangesRotting(int[][] grid) {
        int time = 0;

        int n = grid.length, m = grid[0].length;
        Queue<Info> q = new LinkedList<>();
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Info(i, j));
                } 
            }
        }

        while(!q.isEmpty()) {
            int size = q.size();
            // Loop for rotten oranges
            for(int i=0; i<size; i++) {
                Info curr = q.remove();
                int row = curr.row, col = curr.col;

                if(row>0 && grid[row-1][col] == 1) {
                    grid[row-1][col] = 2;
                    q.add(new Info(row-1, col));
                }

                if(row<n-1 && grid[row+1][col] == 1) {
                    grid[row+1][col] = 2;
                    q.add(new Info(row+1, col)); 
                }

                if(col>0 && grid[row][col-1] == 1) {
                    grid[row][col-1] = 2;
                    q.add(new Info(row, col-1));
                }

                if(col<m-1 && grid[row][col+1] == 1) {
                    grid[row][col+1] = 2;
                    q.add(new Info(row, col+1));
                }

            }

            if(q.isEmpty()) {
                break;
            }
            
            time++;
            size = q.size();
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return time;
    }
}