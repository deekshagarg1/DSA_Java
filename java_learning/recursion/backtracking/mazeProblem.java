import java.util.ArrayList;
import java.util.Arrays;

public class mazeProblem{
    public static void main(String[] args){

        // System.out.println(pathCount(3,3));
        // paths("", 3, 3);
        // System.out.println(pathReturn("",3,3));
        // System.out.println(pathReturnDiagonal("",3,3));

        boolean[][] board={
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        // pathWithObstracle("" , board, 0, 0);

          boolean[][] maze={
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        // pathAllDirection("" , maze, 0, 0);

        int[][] path = new int[maze.length][maze[0].length];
        pathAllDirectionPrint("", maze, 0, 0, path, 1);

    }

// --------------------------------------------------
    static int pathCount(int r, int c){
        //coloumn == towards right -> ,, row == towards downwards 

        if(r ==1 || c==1){
            return 1;
        }

        int right = pathCount(r, c-1);
        int down = pathCount(r-1 , c);

        return right + down; // person can go only right and down in the maze
    }

// -----------------------------------------------------------------
    static void paths(String p , int r , int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){ // if we goes in row direction then it will go downwards
            paths(p + 'D', r-1, c);
        }

        if(c>1){//// if we goes in column direction then it will go towards right
            paths(p +'R', r, c-1);
        }
    }

// -------------------------------------------------------------

static ArrayList<String> pathReturn(String p , int r , int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r>1){ // if we goes in row direction then it will go downwards
            list.addAll(pathReturn(p + 'D', r-1, c));
        }

        if(c>1){//// if we goes in column direction then it will go towards right
            list.addAll(pathReturn(p +'R', r, c-1));
        }

        return list;
    }


// ------------------------------------------------------------------------

static ArrayList<String> pathReturnDiagonal(String p , int r , int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

          if(r>1 && c>1){ // if we goes in diagonal both row and col will reduce by 1
            list.addAll(pathReturnDiagonal(p + 'D', r-1, c-1));
        }

        if(r>1){ // if we goes in row direction then it will go downwards -- vertically
            list.addAll(pathReturnDiagonal(p + 'V', r-1, c));
        }

        if(c>1){//// if we goes in column direction then it will go towards right -- horizontally
            list.addAll(pathReturnDiagonal(p +'H', r, c-1));
        }

        return list;
    }

// -------------------------------------------------------------------
 
 static void pathWithObstracle(String p , boolean[][] maze, int r , int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){ //maze is false at index [r][c] -- it will return
            return;
        }

        if(r < maze.length-1){ // if we goes in row direction then it will go downwards
            pathWithObstracle(p + 'D', maze, r+1, c);
        }

        if(c < maze[0].length-1){//// if we goes in column direction then it will go towards right
            pathWithObstracle(p +'R', maze, r, c+1);
        }
    }

// -----------------------------------------------------------------
 
 static void pathAllDirection(String p , boolean[][] maze, int r , int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){ //maze is false at index [r][c] -- it will return
            return;
        }

        //i m considering this block in my path
        maze[r][c] = false;

        if(r < maze.length-1){ // if we goes in row direction then it will go downwards
            pathAllDirection(p + 'D', maze, r+1, c);
        }

        if(c < maze[0].length-1){//// if we goes in column direction then it will go towards right
            pathAllDirection(p +'R', maze, r, c+1);
        }

        if( r > 0){//// if we goes in row direction towards upwards
            pathAllDirection(p +'U', maze, r-1, c);
        }

        if(c > 0){//// if we goes in column direction towards backside/left
            pathAllDirection(p +'L', maze, r, c-1);
        }

        //this line is where the function will be over
        //so before the function gets removed, also remove the changes backward were made by the function call
        maze[r][c] = true; //this will remove the previous call -- called as back-tarcking -- make a change when work is done

    }


// --------------------------------------------------------


static void pathAllDirectionPrint(String p , boolean[][] maze, int r , int c, int[][] path, int steps){
        if(r== maze.length-1 && c==maze[0].length-1){
            path[r][c] = steps;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){ //maze is false at index [r][c] -- it will return
            return;
        }

        //i m considering this block in my path
        maze[r][c] = false;
        path[r][c] = steps;

        if(r < maze.length-1){ // if we goes in row direction then it will go downwards
            pathAllDirectionPrint(p + 'D', maze, r+1, c, path, steps+1);
        }

        if(c < maze[0].length-1){//// if we goes in column direction then it will go towards right
            pathAllDirectionPrint(p +'R', maze, r, c+1, path, steps+1);
        }

        if( r > 0){//// if we goes in row direction towards upwards
            pathAllDirectionPrint(p +'U', maze, r-1, c, path, steps+1);
        }

        if(c > 0){//// if we goes in column direction towards backside/left
            pathAllDirectionPrint(p +'L', maze, r, c-1, path, steps+1);
        }

        //this line is where the function will be over
        //so before the function gets removed, also remove the changes backward were made by the function call
        maze[r][c] = true; //this will remove the previous call -- called as back-tarcking -- make a change when work is done
        path[r][c] = 0;

    }



}