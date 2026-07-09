// 33. Search in Rotated Sorted Array

// There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4



//this will not work for duplicate values, and this can also be done in recrsion by using single method--
import java.util.Scanner;

public class rotatedBinarySearch{


static int countRotation(int[] arr){
    int pivot = findPvoit(arr);
    return pivot +1; // even if arr is not roated then pivot is -1, so -1+1 =0 -- means no rotation
}

 static int binarySearch(int[] arr , int target, int start , int end){
    // int start =0 ;
    // int end = arr.length -1;

    while(start<=end){
        int mid = start + (end - start) / 2 ;
        
        if(arr[mid]== target){
            //target found at the middle
            return mid;
        }else if(arr[mid] > target){
            //mid is larger then target , so end will move to left side of mid and start remain constant
            end = mid -1;
        }else{
            // mid is smaller than target, start move to right side of mid and end remain constant
            start = mid +1 ;
        }
    }
    return -1; //target not found
}


static int findPvoit(int[] arr){
    int start =0 ;
    int end = arr.length -1;

    while(start <= end) {

    int mid = start + (end - start) / 2 ;
    
    if(mid < end && arr[mid] > arr[mid+1]){ //id mid is last element it will show indexOutOfBoundError
        return mid;
    }
    if(mid > start && arr[mid] < arr[mid-1]){ //id mid is last element it will show indexOutOfBoundError
        return mid-1;
    }

    if(arr[mid] <= arr[start]){
        end = mid -1 ;
    }else{
        start = mid +1;
    }
    }

    return -1;

}

 static int search(int[] nums, int target) {
        
        int pivot = findPvoit(nums);
        //if you don't find the pvoit it means array is not ratated
        if(pivot == -1){
            return binarySearch(nums , target , 0 , nums.length-1); //just do normal binary search
        }

        //if pivot is found, you have 2 asc orders
        if(nums[pivot] == target){
            return pivot;
        }

        if(target >= nums[0]){//means in left side , if target is greater then starting index 
             return binarySearch(nums , target ,0, pivot);
        }

        //target is smaller than starting index
         return binarySearch(nums , target , pivot+1 , nums.length-1);
    }


// ----------------------------
public static void main(String[] args){
int[] nums = {4,5,6,7,0,1,2}; //{0,1,2,3,4,5,6,7}-- 4 5 6 7 are shifted to left
int target = 0;

// rotatedBinarySearch obj = new rotatedBinarySearch();
System.out.println("ans is : " +search(nums , target));

System.out.println("rotation is : " +countRotation(nums));
}

}