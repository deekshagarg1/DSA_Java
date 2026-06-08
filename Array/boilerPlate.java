
// import java.util.Scanner;
import java.util.*;

public class boilerPlate{

    //print an array--
    static void printArr (int[] arr){
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
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
       
      
    }
}