import java.util.Arrays;

public class searchMatrix{

       public boolean searchMatrixLeetcode(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int i =0;
        int j = col-1;
        while( i < row && j >=0){
            if(matrix[i][j] == target){
                return true;
            }

            if(matrix[i][j] > target ){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args){

        int[][] matrix = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
            };


            System.out.println("matrix is : ");
            System.out.println(Arrays.deepToString(matrix));

            searchMatrix obj = new searchMatrix();
            boolean ans = obj.searchMatrixLeetcode(matrix , 16); //matrix and target value
            System.out.println("Answer is : " + ans);
    }
}