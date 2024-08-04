// 200. Number of Islansd
// Medium

// TimeComplexity : O(m*n)
// SpaceComplexity : O(m*n)

class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0 || grid==null){
            return 0;
        }

        int ans=0;

        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(i,j,grid);
                }
            }
        }
        return ans;
    }

    public void dfs(int i,int j,char[][] grid){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='1'){
            return;
        }
        grid[i][j]='0';
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);
    }
}
