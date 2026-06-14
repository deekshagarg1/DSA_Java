// 74. Search a 2D Matrix --- leetcode
// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

// Example 1:
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

import java.util.Scanner;
import java.util.Arrays;

public class Search_In_2DMatrix{

    static void printMatrix(int[][] matrix){
          //printing the matrix 
        for(int[] ele : matrix){
            for(int element : ele){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


    static int[] binarySearchIn2DMatrix(int[][] matrix , int target){

            int row = 0;
            int col = matrix[row].length -1 ;

            while( row < matrix.length && col >= 0 ){
                if( matrix[row][col] == target ){
                    return new int[]{row , col};
                }else if( target < matrix[row][col]){
                    col--;
                }else{
                    row++; //target > matrix[row][col];
                }
            }

        return new int[]{-1, -1};
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of rows : ");
        int r = sc.nextInt(); 
        System.out.print("enter number of column : ");
        int c = sc.nextInt(); 

        int[][] matrix = new int[r][c];

        System.out.print("enter " +r*c +" elements for matrix : ");
        for(int i =0 ; i<r ; i++){
            for(int j = 0; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        System.out.println(Arrays.deepToString(matrix)); //for direct printing
        
        System.out.print("enter target number : ");
        int target = sc.nextInt(); 

        int[] ans = binarySearchIn2DMatrix(matrix , target);
        System.out.print("indexs are : " +Arrays.toString(ans)); //for direct printing

  


    }
}

