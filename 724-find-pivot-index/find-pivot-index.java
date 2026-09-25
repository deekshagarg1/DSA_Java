class Solution {
    public int pivotIndex(int[] nums) {
        //sum
        int sum =0;
        for(int num : nums){
            sum = sum + num;
        }

        int left = 0;
    
        for(int i =0; i<nums.length; i++){
           
           int  right = sum - nums[i] - left;

            if(left == right){
                return i;
            }
             left +=nums[i];
        }
        return -1;
    }
}