// leetcode-- two sum--

import java.util.Scanner;
import java.util.Arrays;
// import java.util.*;

public class twoSum{

    //print an array--
    static void printArr (int[] arr){
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    //    public int[] twoSum_bruteForce(int[] nums, int target) {
    //     for(int i =0 ; i<nums.length ; i++){
    //         for(int j = i+1 ; j<nums.length ; j++ ){
    //             if(nums[i] + nums[j] == target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[0];
    // }


//optimal-- only for sorted array not for unsorted-----------------
   public int[] twoSum_optimal(int[] nums, int target) {
      int i=0;
      int j = nums.length-1;

      while(i<j){
        // if(nums[i]+nums[j]== target){

        // }
        if(nums[i]+nums[j] > target){
            j--;
        }else if(nums[i]+nums[j] < target){
            i++;
        }else{
            return new int[]{i,j};
        }
      }
      return new int[0];
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
        System.out.print("Array is : ");
        printArr(arr);
       
       //for output--

       twoSum obj = new twoSum();

       System.out.print("Enter target sum in the array : ");
       int target = sc.nextInt();

    //    int[] ans = obj.twoSum_bruteForce(arr , target); // because we are returing the array
    //    System.out.print("Ans is : " +Arrays.toString(ans)); //convert in array then string-- import from java.util.Array or java.util.*
      
       int[] ans1 = obj.twoSum_optimal(arr , target); // because we are returing the array
       System.out.print("Ans is : " +Arrays.toString(ans1));
    }
}





// --other array methods-------
// Arrays.toString(arr);   // Print array
// Arrays.sort(arr);       // Sort array
// Arrays.equals(a,b);     // Compare arrays
// Arrays.fill(arr, 0);    // Fill array