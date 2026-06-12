// removeDuplicates-- done on both -- gfg and leetcode-- for sorted array


// import java.util.Scanner;
// import java.util.ArrayList;

import java.util.*;

public class removeDuplicates{

    //print an array--
    static void printArr (int[] arr){
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

 public int removeDuplicates_leetCode(int[] nums) {
        int j =1;
        for(int i =1 ; i<nums.length ; i++){
            if(nums[i]!=nums[j-1]){ //ArrayIndexOutOfBoundsException de sakta hai. so taking nums[j-1]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;
                j++;
            }
        }
 return j;
 }

 ArrayList<Integer> removeDuplicates_GFG(int[] arr) {
        // code here
        int j=0;
        for(int i=1; i<arr.length ; i++){
            if(arr[i]!=arr[j]){
                arr[++j]=arr[i];
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<=j ; i++){
                ans.add(arr[i]);
        }
        
        return ans;
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
       
      removeDuplicates obj = new removeDuplicates();
      int leetCode = obj.removeDuplicates_leetCode(arr);
      System.out.println("leetcode : " +leetCode);
    //   printArr(arr);
 


    ArrayList<Integer> ans = obj.removeDuplicates_GFG(arr);
    // System.out.println(ans);
    }
}
