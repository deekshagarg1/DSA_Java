class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixSum = 0;
        int count = 0;

        for(int num : nums){
            prefixSum += num;

            int reminder = prefixSum % k;

            if(reminder < 0){
                reminder = reminder + k; // reminder never be negative
            }

            if(map.containsKey(reminder)){
                count += map.get(reminder); //reminder key ki value add hogi
            }

            map.put(reminder, map.getOrDefault(reminder, 0)+1);
        }
        return count;
    }
}