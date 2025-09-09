class Solution {

    public int memo(int[] coins, int amount, int[] dp) {
        if(amount == 0){
            return 0;
        }
        if (dp[amount] != 0) return dp[amount];
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++){
            if(amount >= coins[i]){
                int recAns = memo(coins, amount - coins[i], dp);
                if(recAns != Integer.MAX_VALUE){
                    int coinsUsed = 1 + recAns;
                    ans = Math.min(ans, coinsUsed);
                }
            }
        }
        return dp[amount] = ans;
    }


    public int tabulation(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        for(int amt = 1; amt <= amount; amt++){
            int ans = Integer.MAX_VALUE;
            for(int i = 0; i < coins.length; i++){
                if(amt >= coins[i]){
                    int recAns = dp[amt - coins[i]];
                    if(recAns != Integer.MAX_VALUE){
                        int coinsUsed = 1 + recAns;
                        ans = Math.min(ans, coinsUsed);
                    }
                }
            }
            dp[amt] = ans;
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public int coinChange(int[] coins, int amount) {
        // int[] dp = new int[amount + 1];
        // int ans = memo(coins, amount, dp);
        // return ans == Integer.MAX_VALUE ? -1 : ans;


        return tabulation(coins, amount);
    }
}