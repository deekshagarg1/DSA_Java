// 75. Sort Colors(leetCode)
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
// -------------------------------------------------------------


import java.util.Scanner;
import java.util.Arrays;


public class SortColors0s1s2s{


static void printArr(int[] arr){
     for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    System.out.println();
}


static void swap(int[] nums, int a, int b){
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
}

 public void sortColors(int[] nums) {
        int low = 0 ;
        int mid = 0;
        int high = nums.length-1;

    while(mid <= high){

        if(nums[mid] == 0){
            swap(nums , mid, low);
            mid++; low++;
        }

        else if(nums[mid] == 1){
            mid++;
        }

        else{ //(nums[mid] == 2)
            swap(nums, mid, high);
            high-- ;
        }

    }
        printArr(nums);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter nummber of terms in array :");
        int n = sc.nextInt();

        System.out.print("enter terms of array :");
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("array is :" +Arrays.toString(arr));

        SortColors0s1s2s obj = new SortColors0s1s2s();
        obj.sortColors(arr);
    }
}