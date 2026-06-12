// striver--    Linear Search--Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target appears in the array. If the target is not found in the array, return -1
// Example 
// Input: nums = [2, 3, 4, 5, 3], target = 3
// Output: 1
// Explanation:The first occurence of 3 in nums is at index 1


import java.util.Scanner;

public class LinearSearch{

    //print an array--
    static void printArr (int[] arr){
        System.out.print("Array is : ");
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    //Linear Search--
    public static int linearSearch(int[] arr , int n){
        for(int i =0 ; i<arr.length ; i++){
            if(arr[i]==n){
                return i; // break the loop at first occurance
            }
        }
        return -1;
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
        printArr(arr);;
       
        System.out.print("Enter number to find in array : ");
        int x = sc.nextInt();

        System.out.println(x  + " is find at index : " + linearSearch(arr,x));
    }
}