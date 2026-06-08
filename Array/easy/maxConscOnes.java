// leetCode -- 485. Max Consecutive Ones ---Given a binary array nums, return the maximum number of consecutive 1's in the array.
// Example
// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

import java.util.Scanner;

public class maxConscOnes{

    //print an array--
    static void printArr (int[] arr){
        System.out.print("Array is : ");
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

//-----------------
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxCount =0 ;

        // for(int arr :  nums){
        //     if(arr==1){
        //         count++;
        //         maxCount = Math.max(maxCount, count);
        //     }else{
        //         count=0;
        //     }
        // }

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==1){
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                count=0;
            }
        }
        return maxCount; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of in the array : ");
        int n = sc.nextInt();

        System.out.print("Enter terms of an array : ");
        int[] arr = new int[n];
        for(int i=0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        printArr(arr);
       
      maxConscOnes obj = new maxConscOnes();
      System.out.print("Max Consecutive Ones count is : " +obj.findMaxConsecutiveOnes(arr));
    }
}