

//GFG--  Check if array is sorted----Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

import java.util.Scanner;

public class checkSortedArray{

     //print an array--
    static void printArr (int[] arr){
        System.out.print("Array is : ");
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    //check sorted array
    public boolean isSorted(int[] arr){
        for(int i =0 ; i<arr.length -1 ; i++){ // for error handling arr[i+1]-- ke liye
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

// ------Check if the Array is Sorted II

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

        // this is not the static function, so we need to make an object
        checkSortedArray obj = new checkSortedArray();
        System.out.print("Is array sorted : " +obj.isSorted(arr));
      
    }
}