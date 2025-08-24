class Solution {

    public int rec(int n){
        return n <= 1 ? n : rec(n-1) + rec(n-2);
    }

    public int memo(int n, int[] dp){
        if(n <= 1)  return n;
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = memo(n-1, dp) + memo(n-2, dp);
        return dp[n];
    }

    public int tabulation(int n){
        // create dp array:
        int[] dp = new int[n+1];

        // analyse base cases:
        dp[0] = 0;
        dp[1] = 1;
        
        // check params, reverse it and run a loop:
        // in recursion, we go n -> 0;
        // after reverse, we go 0 -> n;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public int spaceOptimisation(int n){
        // create vars:
        int prev = 0, curr = 1;
        
        // check params, reverse it and run a loop:
        // in recursion, we go n -> 0;
        // after reverse, we go 0 -> n;
        for(int i = 2; i <= n; i++){
            int ans = prev + curr;
            prev = curr;
            curr = ans;
        }

        return curr;
    }

    public int fib(int n) {
        // return rec(n);

        // int[] dp = new int[n+1];
        // return memo(n, dp);

        // return n == 0 ? 0 : tabulation(n);
        return n == 0 ? 0 : spaceOptimisation(n);
    }
}