import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_2D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialization--
        for(int i =0 ; i<3 ; i++){
            list.add(new ArrayList<>()); // this is for 2-Dimentional arrayList
        }

        //add elements--
        for(int i =0 ; i<3 ; i++){
            for(int j =0 ; j<4 ; j++){
                list.get(i).add(sc.nextInt()); //getting index of i , at which 2d elements are added
            }
        }

        System.out.print(list); //[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]

        
    }
}
