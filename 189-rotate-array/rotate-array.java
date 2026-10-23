// class Solution {
//     public void rotate(int[] nums, int k) {
//        int n = nums.length;
//         k %= n;

//         reverse(nums , 0 , n-k-1);
//         reverse(nums ,n-k , n-1);
//         reverse(nums, 0 , n-1);
//         // printArr(nums); //leetcode doesnot need print method

//     }

//     static void reverse(int[] arr , int start , int end){
//     while(start < end){
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
//         start++;
//         end--;
//     }
//     // printArr(arr); // this call print function agian and again after every reverse in rotation function
// }

// //  static void printArr (int[] arr){
// //         System.out.print("Array is : ");
// //          for(int i=0 ; i < arr.length ; i++){
// //            System.out.print( arr[i] + " ");
// //         }
// //         System.out.println();
// //     }

// }


class Solution {
    public void rotate(int[] nums, int k) {
     int n = nums.length;

    k = k % n;
    
     if(k == 0){
        return;
     }
    //[1,2,3,4,5,6,7]
    // reverse whole -- [7,6,5,4,3,2,1]
    // 0 to k-1 -- [5,6,7]  and k to n -- [ 1,2,3,4]
    // ans = [5,6,7,1,2,3,4]

     reverse(nums , 0 , n-1);
     reverse(nums, 0, k-1);
     reverse(nums, k, n-1);
    }

    static void reverse(int[] nums , int start , int end){
    while(start < end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
  }

}