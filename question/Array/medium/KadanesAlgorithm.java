// 53. Maximum Subarray----Given an integer array nums, find the subarray with the largest sum, and return its sum.

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.


import java.util.Arrays;

public class KadanesAlgorithm{

public int maxSubArray(int[] nums) {
        int n = nums.length;
        // int maxx =  Integer.MIN_VALUE;

        // // -------brute force way (n^3)---------------
    
        // for(int i = 0 ; i< n ; i++){
        //     for(int j = i ; j < n ; j++){
        //         int sum =0 ;
        //         for(int k = i ; k <= j ; k++){
        //             sum += nums[k];
        //         }
        //             maxx = Math.max(sum, maxx);
        //     }
        // }
        // return maxx;

        // ----better way--(it will give errow while submitting)------------(n^2)-------------
        
        // for(int i = 0 ; i< n ; i++){
        //         int sum =0 ;
        //     for(int j = i ; j < n ; j++){
        //             sum += nums[j];
        //             maxx = Math.max(sum, maxx);
        //     }
        // }
        // return maxx;

  //   -------kadane's algorithm----------------
        int sum = 0 ;
        int maxx = nums[0];
        for(int i =0 ; i<n ; i++){
            sum = Math.max(nums[i] , sum+nums[i]);
            maxx = Math.max(sum, maxx);
        }
        return maxx;

  
  // ---------optimal--tough--------only for positive and negative both contain array, not for only negative array
    // int sum =0 ;
    // for(int i =0 ; i < n ; i++){

    //     sum = sum + nums[i];

    //     if(sum < 0 ){
    //         sum =0;
    //     }

    //     if(sum > maxx){
    //         maxx = sum;
    //     }
    // }

    // return maxx ; 
    }


// ---------------------------------------------------------
// --extra----Print subarray with maximum subarray sum (extended version of above problem)

    public static void printSubArray(int[] nums){
    int n = nums.length;
    int sum =0 ;
    int maxx = nums[0];
    int ansStart = -1 ; 
    int ansEnd =- 1;
    int start = nums[0];

    for(int i =0 ; i < n ; i++){

        if(sum == 0) {
         start = i;
        }

        sum = sum + nums[i];

        if(sum < 0 ){
            sum =0;
        }

        if(sum > maxx){
            maxx = sum;
            ansStart = start ;
            ansEnd = i;
        }
    }

    System.out.print("largest subarray is : ");
    for( int i = ansStart ; i <= ansEnd ; i++){
        System.out.print(nums[i] + " ");
    }
}
    
    // -------------------------------------------------------------------------
    
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Array is : " +Arrays.toString(nums));

        KadanesAlgorithm obj = new KadanesAlgorithm();
        int ans = obj.maxSubArray(nums);
        System.out.println("Answer is : " +ans);

        //for printing the subarray--------
        printSubArray(nums);


    }
}