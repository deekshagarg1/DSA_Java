//gfg--Given an array arr[]. The task is to find the largest element and return it.

import java.util.Scanner;

public class largest{

    //print an array--
    static void printArr (int[] arr){
        System.out.print("Array is : ");
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    // find largest--
    public static int largest(int[] arr){
        int max = arr[0];

        for(int i =0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
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
        printArr(arr);
       
        System.out.println("largest is : " + largest(arr));
    }
}