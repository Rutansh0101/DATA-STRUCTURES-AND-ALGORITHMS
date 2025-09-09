class Solution {

    public int recursion(int[] nums, int lastIndex, int index) {
        if(index >= nums.length)  return 0;
        int include = 0;
        if(lastIndex == -1 || nums[lastIndex] < nums[index]){
            include = 1 + recursion(nums, index, index + 1);
        }
        int exclude = recursion(nums, lastIndex, index + 1);
        return Math.max(include, exclude);
    }

    public int memo(int[] nums, int lastIndex, int index, int[][] dp){
        if(index >= nums.length)  return 0;
        if(dp[lastIndex + 1][index] != -1)   return dp[lastIndex + 1][index];
        int include = 0;
        if(lastIndex == -1 || nums[lastIndex] < nums[index]){
            include = 1 + memo(nums, index, index + 1, dp);
        }
        int exclude = memo(nums, lastIndex, index + 1, dp);
        return dp[lastIndex + 1][index] = Math.max(include, exclude);
    }

    public int tabulation(int[] nums){
        int[][] dp = new int[nums.length+1][nums.length + 1];
        // if i had used 0 instead of -1 as init, TC might have fell upto O(2 ^ n), so it is important to keep -1;
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++) dp[i][j] = -1;
        }

        for(int row = 0; row <= nums.length; row++){
            dp[nums.length][row] = 0;
        }


        // reversing the params:
        for(int index = nums.length - 1; index >= 0; index--){
            // Observation: LastIndex is always lesser than currentIndex;
            for(int lastIndex = index-1; lastIndex >= -1; lastIndex--){
                int include = 0;
                if(lastIndex == -1 || nums[lastIndex] < nums[index]){
                    include = 1 + dp[index + 1][index+1];
                }
                int exclude = dp[index + 1][lastIndex+1];
                dp[index][lastIndex + 1] = Math.max(include, exclude);
            }
        }
        // lastIndex and index both goes down to 0, so the answer will get stored in 0, 0;
        return dp[0][0];
    }

    public int lengthOfLIS(int[] nums) {
        // int lastIndex = -1;
        // return recursion(nums, lastIndex, 0);


        // // memoization:
        // int lastIndex = -1;
        // int[][] dp = new int[nums.length + 1][nums.length];
        // // if i had used 0 instead of -1 as init, TC might have fell upto O(2 ^ n), so it is important to keep -1;
        // for(int i = 0; i < dp.length; i++){
        //     for(int j = 0; j < dp[0].length; j++) dp[i][j] = -1;
        // }
        // return memo(nums, lastIndex, 0, dp);


        // tabulation:
        return tabulation(nums);
    }
}