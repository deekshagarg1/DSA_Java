// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         List<Integer> pos = new ArrayList<>();
//         List<Integer> neg = new ArrayList<>();

//         for(int i = 0; i<nums.length; i++ ){
//             if(nums[i]>=0){
//                 pos.add(nums[i]);
//             }else{
//                 neg.add(nums[i]);
//             }
//         }

//         //if negative list is empty -- it means all are positive so it is already sorted if we square it
      
//         //for squaring negative values--
//         for(int i = 0; i < neg.size(); i++){
//              neg.set(i, neg.get(i)*neg.get(i));
//         }

//         //for squaring positive values--
//         for(int i = 0; i < pos.size(); i++){
//              pos.set(i, pos.get(i)*pos.get(i));
//         }

//         //merging both the arrays -- negative list index will start from last because it is desc order sorted -- [-4,-1]--[16,1]

//         int[] result = new int[nums.length];
//         int i = neg.size()-1;
//         int j = 0; // for positive list
//         int k=0;

//         while(i >= 0 && j < pos.size()){
//             if(pos.get(j) > neg.get(i)){
//                 result[k++] = neg.get(i--);
//                 //result[k]=neg.get(i);
//                 // k++;
//                 // i--; //i ko minus kerenge kuki vo last index se move ho raha h 
//             }else{
//                 result[k++]=pos.get(j++);
//             }
//         }

//     //negative array is not empty
//     while(i>=0){
//         result[k++] = neg.get(i--);
//     }

//     //positve array is not empty
//     while(j < pos.size()){
//         result[k++]=pos.get(j++);
//     }
        
//         return result;
//     }
// }

// ----------optimal----------------
class Solution {
    public int[] sortedSquares(int[] nums) {
        int left =0;
        int right = nums.length-1;

        int[] result = new int[nums.length];
        int index =nums.length-1;

        while(left <= right){
            int leftSqt = nums[left]*nums[left];
            int rightSqt = nums[right]*nums[right];

            if(leftSqt > rightSqt){
                result[index--]=leftSqt;
                left++;
            }else{
                result[index--]=rightSqt;
                right--;
            }
        }
        return result;
    }
}