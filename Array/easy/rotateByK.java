
import java.util.Scanner;

public class rotateByK{

    //print an array--
    static void printArr (int[] arr){
        System.out.print("Array is : ");
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

//reverse an array--
static void reverse(int[] arr , int start , int end){
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
   
}

// --------rotate----------------------
 public void leftRotateByK(int[] nums, int k) {
        int n = nums.length-1;
        k %= n;

        reverse(nums , 0 , k-1);
        reverse(nums , k , n);
        reverse(nums, 0 , n);
        printArr(nums);

    }

    // right rotation----------
    public void rightRotateByK(int[] nums, int k) {

    int n = nums.length;
    k %= n;

    reverse(nums, 0, n - k - 1);
    reverse(nums, n - k, n - 1);
    reverse(nums, 0, n - 1);

    printArr(nums);
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
       
    //    -----------reverse function checking-------------------
    //    System.out.print("Enter start index for rotation : ");
    //     int x = sc.nextInt();
    //     System.out.print("Enter last index for rotation : ");
    //     int y = sc.nextInt();
    //     reverse(arr, x, y);
    //     printArr(arr);


    // ---------- rotation by kth  left-----------------------
        // System.out.print("Enter d number of rotation : ");
        // int d = sc.nextInt();
        // rotateByK obj = new rotateByK();
        // System.out.print("rotate by k left : " ); 
        // obj.leftRotateByK(arr,d); //void call

 // ---------- rotation by kth right-----------------------
        System.out.print("Enter d number of rotation : ");
        int d = sc.nextInt();
        rotateByK obj = new rotateByK();
        System.out.print("rotate by k right : " ); 
        obj.rightRotateByK(arr,d); //void call
    }
}