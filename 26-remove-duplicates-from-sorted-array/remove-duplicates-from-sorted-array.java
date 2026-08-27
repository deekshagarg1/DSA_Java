// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int j =1;
//         for(int i =1 ; i<nums.length ; i++){
//             if(nums[i]!=nums[j-1]){ //ArrayIndexOutOfBoundsException de sakta hai. so taking nums[j-1]
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j]=temp;
//                 j++;
//             }
//         }
//         return j;
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        int j =1;
        int i= 0;
        int count =1;
        while(j < nums.length){
            if(nums[j]==nums[j-1]){
                j++;
                continue;
            }else{
                nums[i+1]=nums[j];
                j++;
                i++;
                count++;
            }
        }
            return count;
    }
}