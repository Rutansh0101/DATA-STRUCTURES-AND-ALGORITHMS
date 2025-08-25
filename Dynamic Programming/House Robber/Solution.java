class Solution {
    
    int ans = 0;

    public void rec(int[] nums, int index, int sum, boolean isRobbed) {
        if(index == nums.length){
            ans = Math.max(ans, sum);
            return;
        }
        if(isRobbed){
            rec(nums, index + 1, sum, !isRobbed);
        }
        else{
            rec(nums, index + 1, sum + nums[index], !isRobbed);
            rec(nums, index + 1, sum, isRobbed);
        }
    }

    public int memo(int[] nums, int index, int[] dp) {
        if(index >= nums.length){
            return 0;
        }
        if(dp[index] != -1)  return dp[index];

        int include = nums[index] + memo(nums, index + 2, dp);
        int exclude = memo(nums, index + 1, dp);
        dp[index] = Math.max(include, exclude);
        return dp[index];
    }

    public int tabulation(int[] nums){
        // base case analysis and init array:
        int[] dp = new int[nums.length+2];

        // reverse : n -> 0:
        for(int i = nums.length - 1; i >= 0; i--){
            int include = nums[i] + dp[i+2];
            int exclude = dp[i+1];
            dp[i] = Math.max(include, exclude);
        }
        return dp[0];
    }

    public int spaceOptimisation(int[] nums){
        // base case analysis and init array:
        int next1 = 0, next2 = 0;

        // reverse : n -> 0:
        for(int i = nums.length - 1; i >= 0; i--){
            int curr = Math.max(nums[i] + next2, next1);
            next2 = next1;
            next1 = curr;
        }
        return next1;
    }

    public int rob(int[] nums) {
        // rec:
        
        // rec(nums, 0, 0, false);
        // return ans;


        // top - down (memo):

        // int[] dp = new int[nums.length];
        // for(int i = 0; i < dp.length; i++)  dp[i] = -1;
        // return memo(nums, 0, dp);

        // bottom - up (tab):
        // return tabulation(nums);

        return spaceOptimisation(nums);
    }
}