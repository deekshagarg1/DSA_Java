// 136. Single Number -- leetcode----Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Input: nums = [2,2,1]
// Output: 1

// solution optimal way------------Ye LeetCode 136 - Single Number ka optimal XOR solution hai.

// XOR Properties -- Isliye jo numbers pair me aate hain wo cancel ho jaate hain, aur jo ek baar aata hai wahi answer bachta hai.
// a ^ a = 0
// a ^ 0 = a


import java.util.*;

public class singleNumber{

    //print an array--
    static void printArr (int[] arr){
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

     public int singleNumberLeetCode(int[] nums) {
        int xorr =0;
        for(int i =0 ; i<nums.length ; i++){
            xorr = xorr ^ nums[i];
        }
        return xorr;
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
       
       singleNumber obj = new singleNumber();
       System.out.print("ans : " +obj.singleNumberLeetCode(arr));

      
    }
}

