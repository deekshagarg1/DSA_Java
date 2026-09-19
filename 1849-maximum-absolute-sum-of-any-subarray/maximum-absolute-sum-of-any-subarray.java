class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ans = 0;
        int max = 0;
        int min = 0;

        for(int i =0; i<nums.length; i++){

            max = Math.max(nums[i], max+nums[i]);
            min = Math.min(nums[i], min+nums[i]);

            ans = Math.max(ans, Math.max(max, -min));
        }
            return ans;
    }
}