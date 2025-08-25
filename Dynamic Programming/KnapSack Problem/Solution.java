class Solution {
    
    static int recursion(int W, int[] val, int[] wt, int index){
        if(index >= val.length) return 0;
        
        int currentVal = val[index];
        int currentWeight = wt[index];
        int include = 0;
        if(currentWeight <= W){
            // we can include:
            include = currentVal + recursion(W - currentWeight, val, wt, index + 1);
        }
        // we can exclude in any case:
        int exclude = recursion(W, val, wt, index + 1);
        return Math.max(include, exclude);
    }
    
    static int memo(int W, int[] val, int[] wt, int index, int[][] dp){
        if(index >= val.length) return 0;
        
        if(dp[W][index] != -1)  return dp[W][index];
        
        int currentVal = val[index];
        int currentWeight = wt[index];
        
        int include = 0;
        if(currentWeight <= W){
            // we can include:
            include = currentVal + memo(W - currentWeight, val, wt, index + 1, dp);
        }
        // we can exclude in any case:
        int exclude = memo(W, val, wt, index + 1, dp);
        
        return dp[W][index] = Math.max(include, exclude);
    }
    
    
    static int tabulation(int W, int[] val, int[] wt) {
        // Identifying ranges:
        // index => 0 -> N;
        // W => W -> 0;
        // reversing the ranges
        int[][] dp = new int[val.length+1][W + 1];
        
        // init all vals with -1, indicates that current subproblem is not solved & stored:
        for(int j = 0; j < val.length; j++){
            for(int i = 0; i <= W; i++){
                dp[j][i] = -1;
            }
        }
        
        for(int index = val.length - 1; index >= 0; index--){
            for(int w = W; w >= 0; w--){
                int currentVal = val[index];
                int currentWeight = wt[index];
                
                int include = 0;
                if(currentWeight <= w){
                    // we can include:
                    include = currentVal + dp[index + 1][w - currentWeight];
                }
                // we can exclude in any case:
                int exclude = dp[index + 1][w];
                dp[index][w] = Math.max(include, exclude);
            }
        }
        return dp[0][W];
    }
    
    
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        
        // // recursion:
        // return recursion(W, val, wt, 0);
        
        // // Memoization:
        // // Identifying ranges:
        // // W => W -> 0;
        // // index => 0 -> N;
        // int[][] dp = new int[W + 1][val.length];
        
        // // init all vals with -1, indicates that current subproblem is not solved & stored:
        // for(int i = 0; i <= W; i++){
        //     for(int j = 0; j < val.length; j++){
        //         dp[i][j] = -1;
        //     }
        // }
        
        // return memo(W, val, wt, 0, dp);
        
        
        // Tabulation:
        return tabulation(W, val, wt);
    }
}
