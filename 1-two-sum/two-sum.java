// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i =0 ; i<nums.length ; i++){
//             for(int j = i+1 ; j<nums.length ; j++ ){
//                 if(nums[i] + nums[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[0];
//     }

// //optimal-- only for sorted array not for unsorted
//     //  public int[] twoSum(int[] nums, int target) {
//     //   int i=0;
//     //   int j = nums.length-1;

//     //   while(i<j){
//     //     if(nums[i]+nums[j] > target){
//     //         j--;
//     //     }else if(nums[i]+nums[j] < target){
//     //         i++;
//     //     }else{
//     //         return new int[]{i,j};
//     //     }
//     //   }
//     //   return new int[0];
//     // }
// }




class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();

       for(int i = 0; i<nums.length; i++){
        int lookFor = target - nums[i];
            if(map.containsKey(lookFor)){
                return new int[] {i, map.get(lookFor)};
            }
            map.put(nums[i], i);
       }
        
        return new int[]{-1,-1};
    }
}