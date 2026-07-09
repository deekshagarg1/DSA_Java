// firstAndLastPosition--geeks for geeks-- only discussion available

import java.util.Scanner;
import java.util.Arrays;

public class firstAndLastPosition{

static int answer1(int[] arr , int target){
    //first find the range
    //first start the box or range of size 2 , then double it after each iteration if target is not found
    int start = 0;
    int end = 1;

    //condition for target lies in the range
    while(target > arr[end]){
        int temp = end + 1; //temporary storing the new start in varaiable temp;

        //now double the size of the box;
        //end == previous end + size of box * 2;

        end = end + (end - start +1) * 2;
        start = temp;
    }

    return position(arr , target , start, end);

}

static int position(int[] arr , int target, int start , int end){

    while(start <= end){
        int mid = start + ( end - start )/2;
        if( arr[mid] == target){
            return mid;
        }

        if(arr[mid] < target){
            start = mid +1;
        }else{
            end = mid -1;
        }
    }

    return -1;

}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter no. of terms in an array: ");
        int n = sc.nextInt();

        System.out.print("enter terms of array : ");
        int[] arr = new int[n];

        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is: " +Arrays.toString(arr));

        //binary search
        System.out.print("enter target in an array: ");
        int target = sc.nextInt();


        // firstAndLastPosition obj = new firstAndLastPosition();
        // int ans = obj.answer1(arr, target);
        System.out.print("ans is : " +answer1(arr, target));
    }
}


//also done leetcode --- 162 , 852, 1095