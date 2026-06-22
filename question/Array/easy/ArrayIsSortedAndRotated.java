// 1752. Check if Array Is Sorted and Rotated

// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

// There may be duplicates in the original array.

// Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

// Example 1:

// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].


// --------------------------------------------------------------
import java.util.Scanner;

public class ArrayIsSortedAndRotated{

    public boolean SortedAndRotated(int[] arr){
        int n = arr.length;
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] > arr[(i+1) % n]){
                count++;
            }
        }
        return  count<=1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // int[] arr = {3, 4, 5, 1, 2}; //true
          int[] arr = {3, 4, 5, 2, 1}; //false-- rotated but not sorted--{2, 1, 3, 4, 5}

        ArrayIsSortedAndRotated obj = new ArrayIsSortedAndRotated();
        boolean ans = obj.SortedAndRotated(arr);
        System.out.println("ans is : " + ans);


    }
}