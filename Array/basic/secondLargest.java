// GFG------Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
// Note: The second largest element should not be equal to the largest element.


import java.util.Scanner;

public class secondLargest{

    //print an array--
    static void printArr (int[] arr){
        System.out.print("Array is : ");
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    // find second largest largest--
    public int getSecondLargest(int[] arr){ // not an optimal solutin it is brust force dolution -- O(n log n)
        int max = arr[0];
        int smax = -1;

        for(int i =0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

         for(int i =0 ; i<arr.length ; i++){
            if(arr[i] != max && arr[i] > smax){
                smax = arr[i];
            }
        }
        return smax;
    }

     public int SecondLar(int[] arr){ // an optimal solutin  O(n)
        int max = arr[0];
        int smax = -1;

        for(int i =0 ; i<arr.length ; i++){
            if(arr[i]>max){
                smax=max; //firstly save the previous max in smax then saving new max in max variable
                max = arr[i];
            }
        }

        return smax;
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
       
        secondLargest obj = new secondLargest();
        System.out.println("brust --- Second largest is : " + obj.getSecondLargest(arr));
        System.out.println("optimal --- Second largest is : " + obj.SecondLar(arr));
    }
}