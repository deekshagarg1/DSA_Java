class Solution {
    public int findMaxLength(int[] nums) {

        for(int i = 0; i <nums.length; i++){
            if(nums[i] == 0) nums[i] =-1;
        }


        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); //sum, its index

        int sum = 0;
        int maxLen = 0;

        for(int i= 0; i<nums.length; i++){
            sum +=nums[i];

            if(map.containsKey(sum)){
                int lastTime = map.get(sum); // it will check the hashMap, agr same sum previously aya ho and jis index prr aya hoga usko return krega
                maxLen = Math.max(maxLen, i - lastTime); // i - lastTime == length dega ye subarray ki, previous occus to current occur
            }else{
                map.put(sum, i); //agr kabhi nhi aya ho to, update krega hashmap ko new key value add kerke
            }
        }
        return maxLen;
    }
}