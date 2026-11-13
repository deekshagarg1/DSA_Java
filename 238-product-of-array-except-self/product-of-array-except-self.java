class Solution {
    public int[] productExceptSelf(int[] nums) {
        // approach -- prefix * suffix

        int n = nums.length;
        int[] ans = new int[n];

        //prefix;
        ans[0] = 1;
        for(int i = 1; i < n ; i++){
            ans[i] = ans[i-1] * nums[i-1];  //[1,2,3,4] -- [1,1,2,6]-- prefix sum-- product of left
        }

        //suffix;
        int suffix = 1;
        for(int i = n-1; i>=0; i--){
            ans[i] = ans[i] * suffix;  //[24,12,8,6]-- index[3,2,1,0]
            suffix = suffix * nums[i];  //[index-- 3,2,1,0]== 
        }
        return ans;
    }
}