import java.util.Scanner;

public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();

//pattern 1
//  *  *  *  *  * 
//  *  *  *  * 
//  *  *  * 
//  *  * 
//  * 

        // for(int i = n ; i > 0 ; i--){
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
// -------------------------------------------------
//  * 
//  *  * 
//  *  *  * 
//  *  *  *  * 
//  *  *  *  *  * 
//  *  *  *  * 
//  *  *  * 
//  *  * 
//  * 
//    for(int i = 0 ; i < 2*n ; i++){ //i ==rows
//     int totalColInRow = i > n ?  2*n -i : i ;
//             for(int j = 0 ; j < totalColInRow ; j++){ // j == coloumn
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
// -------------------------------------------------


//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     *

//  for(int i = 0 ; i < 2*n ; i++){ //i ==rows

// int totalColInRow = i > n ?  2*n -i : i ;

// //  total space--
// int totalSpace = n - totalColInRow;

//  for(int j = 0 ; j < totalSpace ; j++){ // j == coloumn
//         System.out.print(" ");
//     }

// for(int j = 0 ; j < totalColInRow ; j++){ // j == coloumn
//         System.out.print("* ");
//     }
// System.out.println();
//  }

// -----------------------------------------------------


// 0 0 0 0 0 0 0 0 0 0 0 
// 0 1 1 1 1 1 1 1 1 1 0 
// 0 1 2 2 2 2 2 2 2 1 0 
// 0 1 2 3 3 3 3 3 2 1 0 
// 0 1 2 3 4 4 4 3 2 1 0 
// 0 1 2 3 4 5 4 3 2 1 0 
// 0 1 2 3 4 4 4 3 2 1 0 
// 0 1 2 3 3 3 3 3 2 1 0 
// 0 1 2 2 2 2 2 2 2 1 0 
// 0 1 1 1 1 1 1 1 1 1 0 
// 0 0 0 0 0 0 0 0 0 0 0


// n = 2*n;
// for(int row =0 ; row <= n ; row++){
//     for(int col =0 ; col <= n; col++){
//         int orgIndex = Math.min(Math.min(row,col) , Math.min(n - row, n -col));
//         System.out.print(orgIndex + " ");
//     }
//     System.out.println();
// }

// -----------------------------------------------------------


// 4 4 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 3 3 4 
// 4 3 2 2 2 2 2 3 4 
// 4 3 2 1 1 1 2 3 4 
// 4 3 2 1 0 1 2 3 4 
// 4 3 2 1 1 1 2 3 4 
// 4 3 2 2 2 2 2 3 4 
// 4 3 3 3 3 3 3 3 4 
// 4 4 4 4 4 4 4 4 4 

int org_n = n;
n = 2*n;
for(int row = 0 ; row <= n ; row++){
    for(int col = 0 ; col <= n; col++){
        int orgIndex = org_n - Math.min(Math.min(row,col) , Math.min(n - row, n -col));
        System.out.print(orgIndex + " ");
    }
    System.out.println();
}

    }
}