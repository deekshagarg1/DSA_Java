
import java.util.Scanner;

public class rotateByOne{

    //print an array--
    static void printArr (int[] arr){
         for(int i=0 ; i < arr.length ; i++){
           System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    //left rotate-- rotate anti-clockwise by one position-striver
    // example--Input: arr[] = [1, 2, 3, 4, 5 ] --- Output: [2, 3, 4, 5, 1]
    // public void leftRotate(int[] arr){
    //     int temp = arr[0];
    //     for(int i = 0 ; i < arr.length-1 ; i++){
    //         arr[i] = arr[i+1];
    //     }
    //     arr[arr.length-1]= temp;
    //     printArr(arr);
    // }

    //right rotate---gfg--Given an array arr, rotate the array by one position in clockwise direction.
    // example--Input: arr[] = [1, 2, 3, 4, 5 ] --- Output: [5, 1, 2, 3, 4]

     public void rightRotate(int[] arr) {
        int temp = arr[arr.length-1];
        for(int i = arr.length-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }
         arr[0] = temp;
         printArr(arr);
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

        rotateByOne obj = new rotateByOne();
        System.out.print("left rotate : " ); 
        // obj.leftRotate(arr); //void call

        System.out.print("right rotate : ");
        obj.rightRotate(arr);
      
    }
}