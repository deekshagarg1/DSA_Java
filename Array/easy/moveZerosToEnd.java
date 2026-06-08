//leetcode -- move Zeros To End -- Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.


import java.util.Scanner;

public class moveZerosToEnd{

    //print an array--
    static void printArr (int[] arr){
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

//brute force approach-- 1. seperate non zero numbers , 2.copy it in array , 3. then in last add zeros in array

    public void moveZeroes1(int[] nums){
        int[] temp = new int[nums.length];
        int k=0;

        //finding non zero elements
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i]!=0){
                temp[k] = nums[i];
                k++;
            }
        }

        //copying non zero to nums array
        for(int i=0 ; i < k ; i++){
            nums[i]=temp[i];
        }

        // adding zeros in last
        for(int i =k ; i<nums.length ; i++){
            nums[i]=0;
        }

    } 

    // optimal solution---
     public void moveZeroes(int[] nums){
        int j =0;
        for(int i =0; i<nums.length ; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
     //for understanding the loop
    //    System.out.print("ans is : ");
    //     printArr(nums);
        }
         System.out.print("ans is : ");
        printArr(nums);
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
       
       moveZerosToEnd obj = new moveZerosToEnd();
    //    obj.moveZeroes1(arr);
    //    System.out.print("ans is : ");
    //    printArr(arr);

        obj.moveZeroes(arr); //optimal solution
    }
}



