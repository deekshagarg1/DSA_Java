// // Moore's Voting Algorithm

// 169. Majority Element
// Given an array nums of size n, return the majority element.

// // The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
// ------------------------------------------------------------------

import java.util.Arrays;

public class MajorityElement{

     public int majorityElement(int[] nums) {
        
//brute force approach-------(n^2)-------
//         int n = nums.length;
//         int count = 0;

//         for(int val : nums){
//             count=0;
//             for(int ele : nums){
//                 if(ele == val){
//                     count++;
//                 }
//             }
//             if(count > n/2){
//                 return val;
//             }
//         }
//              return -1;
// // --------------------------------------------



// // optimal solution--------------(nlogn)-------------
// Arrays.sort(nums);
// System.out.println("array is :" +Arrays.toString(nums));

// int ans = nums[0];
// int freq = 1;
// for(int i = 1 ; i<nums.length ; i++){
//     if(nums[i] == nums[i-1]){
//         freq ++;
//     }else{
//         freq =1;
//         ans = nums[i];
//     }

//     if(freq >  nums.length/2){
//         return ans;
//     }
// }

// return -1;
// ----------------------------------------------


//Moore's Voting Algorithm-------------------------Moore's Voting Algorithm works by maintaining a candidate and a count. Matching elements increase the count, while different elements decrease it. Since the majority element appears more than n/2 times, it cannot be completely cancelled and remains the final candidate. Time complexity is O(n) and space complexity is O(1). 🚀
int count = 0;
int ans = 0;
for(int i =0 ; i<nums.length ; i++){
  if(count == 0){
    ans = nums[i];
    count=1;
  }else if (ans == nums[i]){
    count++;
  }else{
    count--;
  }
}

return ans;


// ---------------------------------------------------
    }

// --------------------------------------------
    public static void main(String[] args){

    int[] nums = {2,3,2,3,1,3,1,3,3,1,3,2,3,2,3};
    System.out.println("array is :" +Arrays.toString(nums));

    MajorityElement obj = new MajorityElement();
    int ans = obj.majorityElement(nums);
    System.out.println("Majority element in array is :" +ans);

    }
}
