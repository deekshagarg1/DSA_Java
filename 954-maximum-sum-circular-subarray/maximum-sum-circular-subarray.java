class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int currmax = 0;
        int currmin = 0;

        int maxSum = nums[0];
        int minSum = nums[0];

        for(int num : nums){

            currmax = Math.max(num, currmax+num);
            maxSum = Math.max(currmax, maxSum);

            currmin = Math.min(num, currmin+num);
            minSum = Math.min(currmin, minSum);

            total +=num;
        }

        if(maxSum < 0){
            return maxSum; // all are negative
        }

        int circularSum = total - minSum;
        return Math.max(maxSum, circularSum);
    }
}