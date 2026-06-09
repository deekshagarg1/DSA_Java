import java.util.Scanner;

public class array2D{

static void printArr(int[][] arr, int r, int c){
  for(int i =0; i<r; i++){
            for(int j =0; j<c ;  j++){
                System.out.print(arr[i][j] + " ");  
            }
             System.out.println();  
        }
}

// -----------------



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no. of rows : ");
        int r = sc.nextInt();
         System.out.print("enter the no. of columns : ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("enter the " +r*c + " elements for an 2d-array : ");
        for(int i =0; i<r; i++){
            for(int j =0; j<c ;  j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D array is : ");
       printArr(arr, r, c);

// ----------------------

      
    }
}