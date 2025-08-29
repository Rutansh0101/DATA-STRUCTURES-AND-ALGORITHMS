class Solution {
    public int largestCombination(int[] candidates) {
        int[] bits = new int[32];

        int ans = 0;

        for(int candidate:candidates) {
            int i = 0;
            while(candidate != 0) {
                bits[i] += (candidate & 1);
                ans = Math.max(ans, bits[i]);
                i++;
                candidate >>= 1;
            }
        }

        return ans;
    }
}

