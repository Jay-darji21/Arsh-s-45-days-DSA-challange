// 1130. Minimum cost tree from leafe values
// Medium

class Solution {
    public int findMax(int l,int h,int[] arr){
        int temp = -1;
        for(int i=l; i<=h ; i++) temp = Math.max(temp,arr[i]);
        return temp;
    }
    public int mctFromLeafValues(int[] arr) {
        if(arr==null || arr.length<= 1) return 0;

        int[][] dp = new int[arr.length][arr.length];

        for(int j=0; j<arr.length ; j++){
            for(int i=j; i>=0; i--){
                for(int k=i; k<j ; k++){
                    int temp = dp[i][k]+dp[k+1][j]+findMax(i,k,arr)*findMax(k+1,j,arr);
                    if(dp[i][j]==0){
                        dp[i][j]=temp;
                    }else{
                        dp[i][j] = Math.min(dp[i][j],temp);
                    }
                }
            }
        }

        return dp[0][arr.length-1];
    }
}