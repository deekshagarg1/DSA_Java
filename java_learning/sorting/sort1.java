import java.util.Scanner;
import java.util.Arrays;

public class sort1{

static void bubbleSort(int[] arr, int n){
 
  for(int i=0 ; i<n ; i++){
 boolean isSwapped=false; //reset after every loop
// for comparing the second element in the loop and loop will always decrease by 1 or bby i, because largest element will goes to last at eacg pass
    for(int j=1 ; j<n-i ; j++){
        if(arr[j] < arr[j-1]){
            //now perform swap
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        
            isSwapped = true;
        }
    }
     // If no swap in this pass, array is already sorted
    if(!isSwapped){
        break;
    }
  }
  System.out.print("Bubble Sorted Array is : " +Arrays.toString(arr));
}
// ---------------------------------------------------------------------------------------
//SELECTION SORT---
static void selectionSort(int[] arr , int n){
    for(int i=0 ; i< n ; i++){
        int last = n - i -1; //for getting the curent last index after swapping the terms in the array

        int maxIndex = getMaxIndex(arr, 0, last); //finding max till current last index only
        swap1(arr, maxIndex , last);
    }
     System.out.println("Selection Sorted Array is : " +Arrays.toString(arr));
}

static int getMaxIndex(int[] arr, int start, int last){
    int max = start; //start index
    for(int i = start; i<=last ; i++){
        if(arr[i] > arr[max]){
            max = i;
        }
    }
    return max;
}

static void swap1(int[] arr, int start, int last){
    int temp = arr[start];
    arr[start] = arr[last];
    arr[last] = temp;
}
// ---------------------------------------------------------------
//INSERTION SORT--

static void insertionSort(int[] arr){
    for(int i = 0; i < arr.length-1; i++){
        for(int j = i+1; j > 0; j--){
            if(arr[j] < arr[j-1]){
                swap1(arr, j , j-1);
            }else{
                break;// j is bigger than j-1 no need to swap
            }
        }
    }
    System.out.println("insertion Sorted Array is : " +Arrays.toString(arr));
}
// ------------------------------------------------------------------
// CYCLIC SORT---------only for consutive number from 1 to n------------

static void cyclicSort(int[] arr){
  
    int i = 0;

    while(i < arr.length){
        int correctIndex = arr[i] -1 ; // value 5 will have 4th index ==> 5-1 =4th
        if(arr[i] != arr[correctIndex]){ // when both value are not belong to same index, they will defer
            swap1(arr , i , correctIndex);
        }else{
        i++;
        }
    }
      System.out.println("Cyclic Sorted Array is : " +Arrays.toString(arr));
}
// -----------------------------------------------------------------------
// 448. Find All Numbers Disappeared in an Array--- Solved--- leetcode
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// 268. Missing Number --------- Solved -- leetcode
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


// -------------------------------------------------------------------
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("enter n number of terms : ");
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is : " +Arrays.toString(arr));

        // bubbleSort(arr,n);
        // selectionSort(arr,n);
        // insertionSort(arr);
        cyclicSort(arr);

    }
}