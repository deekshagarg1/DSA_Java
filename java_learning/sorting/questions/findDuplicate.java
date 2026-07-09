// https://leetcode.com/problems/find-the-duplicate-number/description/?ref=secondlife.tw
// 287. Find the Duplicate Number ---- leetcode-- Solved
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and using only constant extra space.


import java.util.Scanner;
import java.util.Arrays;

public class findDuplicate{
    public static void main(String[] args){
        int[] nums =  {1,3,4,2,5,4};
        System.out.println("Array is: " +Arrays.toString(nums));

        // int ans =  findDuplicate1(nums);
        // System.out.println("Answer is: " +ans);


        int ans =  findDupli2(nums);
        System.out.println("Answer is: " +ans);
    }


     public static int findDuplicate1(int[] nums) {
        int i =0;
        //sorting the array -- cyclic sort
     while( i < nums.length){

        if(nums[i] != i+1){

            int correctIndex = nums[i] -1;
            if(nums[i] != nums[correctIndex]){
                //swap function
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }  else{
                return nums[i];
            }

        }else{
            i++;
         }
     }
    return -1;
    }

// Solution 2: Floyd's Tortoise and Hare (Optimal Solution)-- best understand it and do it--  doing later after learning concept
      public static int findDupli2(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find the intersection point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

}

// -------------------------------------------------------------------------
// ----releated questions-----------------to cyclic sort-----------------

//✔️ 448. Find All Numbers Disappeared in an Array--- Solved--- leetcode--https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/?ref=laigary.com
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

//✔️ 268. Missing Number --------- Solved -- leetcode---https://leetcode.com/problems/missing-number/?ref=secondlife.tw
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

//✔️ 442. Find All Duplicates in an Array -- leetcode --- done---https://leetcode.com/problems/find-all-duplicates-in-an-array/?ref=secondlife.tw
// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output


//✔️ 645. Set Mismatch --- leetcode -- done--https://leetcode.com/problems/set-mismatch/?ref=laigary.com
// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
// You are given an integer array nums representing the data status of this set after the error. Find the number that occurs twice and the number that is missing and return them in the form of an array.
// Example 1:
// Input: nums = [1,2,2,4]
// Output: [2,3]


//✔️ 41. First Missing Positive --leetcode--- done---https://leetcode.com/problems/first-missing-positive/description/?ref=secondlife.tw
// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

// Example 1:
// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.