class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;  i < nums.length -2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int j = i+1; //left
            int k = nums.length -1; //right

            //two pointers
            while( j < k){
                int sum = nums[i]+nums[j]+nums[k];

                if(sum == 0){
                    result.add(Arrays.asList(
                        nums[i],
                        nums[j],
                        nums[k]
                    ));

                    j++;
                    k--;

                    //skip the left duplicates--
                    while( j < k && nums[j] == nums[j-1]){
                        j++;
                    }

                    //skip the right duplicates--
                    while( j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                }else if(sum > 0){
                    k--;
                }else{ //sum < 0
                    j++;
                }
            }
        }
        return result;
    }
}