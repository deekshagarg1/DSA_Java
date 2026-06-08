// missingInArray--gfg and leetcode (268) also--You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

// Input: arr[] = [1, 2, 3, 5]
// Output: 4
// Explanation: All the numbers from 1 to 5 are present except 4.

import java.util.*;

public class missingInArray{

    //print an array--
    static void printArr (int[] arr){
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    int missing(int[] arr){
        int n = arr.length + 1; //because one element is missing
        int sum = n*(n+1)/2;
        int totalSum = 0 ;
      

        for(int ele : arr){
            totalSum += ele;
            // System.out.println(totalSum); //checking purpose
        }

        int missingElement = sum - totalSum;
        return missingElement;
    }

       public int missingNumber(int[] arr) {
        // if array is given in simple for (int[] nums ={3,0,1};), then n = arr.length,-- for static array
        
        int n = arr.length +1 ; // for dynamic arrray-- because array is fixedly given by user , so we need to increase it.

        int ExpectedSum = n*(n+1)/2;
        int ActualSum = 0 ;
      

        for(int ele : arr){
            ActualSum += ele;
            // System.out.println(totalSum); //checking purpose
        }

        return ExpectedSum - ActualSum;
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

        missingInArray obj = new missingInArray();
        // int ans = obj.missing(arr);
        // System.out.println("missing element is : " +ans);
     
        int ans1 = obj.missingNumber(arr);
        System.out.println("missing element is (leetcode): " +ans1);
      
    }
}